package uk.co.flax.luwak;/*
 * Copyright (c) 2013 Lemur Consulting Ltd.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public class QueryMatch {

    private final String queryId;

    private final String docId;

    public QueryMatch(String queryId, String docId) {
        this.queryId = queryId;
        this.docId = docId;
    }

    public String getQueryId() {
        return queryId;
    }

    public String getDocId() {
        return docId;
    }
}
