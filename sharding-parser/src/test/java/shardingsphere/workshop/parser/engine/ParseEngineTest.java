/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package shardingsphere.workshop.parser.engine;

import java.util.List;
import org.junit.Test;
import shardingsphere.workshop.parser.statement.segment.IdentifierSegment;
import shardingsphere.workshop.parser.statement.statement.InsertStatement;
import shardingsphere.workshop.parser.statement.statement.SelectStatement;
import shardingsphere.workshop.parser.statement.statement.UseStatement;
import shardingsphere.workshop.parser.statement.statement.WhereClauseStatement;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public final class ParseEngineTest {
    
    @Test
    public void testParse() {
        String sql = "use sharding_db";
        UseStatement useStatement = (UseStatement) ParseEngine.parse(sql);
        assertThat(useStatement.getSchemeName().getIdentifier().getValue(), is("sharding_db"));
    }

    @Test
    public void testInsert() {
        String sql = "INSERT INTO user_question (question_id,question_uuid) VALUES (1,'f69fbbd6da084d498efb2d32bd07f7b7');";
        InsertStatement insertStatement = (InsertStatement) ParseEngine.parse(sql);

        System.out.println("表名："+insertStatement.getTableNameSegment().getValue());
        List<IdentifierSegment> columnNameSegmentList = insertStatement.getColumnNameSegmentList();
        for(IdentifierSegment columnNameSegment:columnNameSegmentList){
            System.out.println("列名："+columnNameSegment.getValue());
        }
        List<IdentifierSegment> valueSegmentList = insertStatement.getValueSegmentList();
        for(IdentifierSegment valueSegment:valueSegmentList){
            System.out.println("值 ："+valueSegment.getValue());
        }
    }

    @Test
    public void testSelect() {
       // String sql = "SELECT name,age from user where id =2 and name = zhangsan";
        String sql = "SELECT name,age from user where id =2 and name = 1231";
        SelectStatement selectStatement = (SelectStatement) ParseEngine.parse(sql);

        System.out.println("表名："+selectStatement.getTableNameSegment().getValue());
        List<IdentifierSegment> columnNameSegmentList = selectStatement.getColumnNameSegmentList();
        for(IdentifierSegment columnNameSegment:columnNameSegmentList){
            System.out.println("列名："+columnNameSegment.getValue());
        }


       List<WhereClauseStatement> whereClauseStatementList = selectStatement.getWhereClauseStatementList();
        for(WhereClauseStatement whereClauseStatement:whereClauseStatementList){
            System.out.println("条件");
            System.out.println(whereClauseStatement.getColumnSegment().getValue());
            System.out.println(whereClauseStatement.getWhere());
            System.out.println(whereClauseStatement.getValueSegment().getValue());
        }

    }
}
