//   The contents of this file are subject to the Mozilla Public License
//   Version 1.1 (the "License"); you may not use this file except in
//   compliance with the License. You may obtain a copy of the License at
//   http://www.mozilla.org/MPL/
//
//   Software distributed under the License is distributed on an "AS IS"
//   basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
//   License for the specific language governing rights and limitations
//   under the License.
//
//   The Original Code is RabbitMQ.
//
//   The Initial Developers of the Original Code are LShift Ltd,
//   Cohesive Financial Technologies LLC, and Rabbit Technologies Ltd.
//
//   Portions created before 22-Nov-2008 00:00:00 GMT by LShift Ltd,
//   Cohesive Financial Technologies LLC, or Rabbit Technologies Ltd
//   are Copyright (C) 2007-2008 LShift Ltd, Cohesive Financial
//   Technologies LLC, and Rabbit Technologies Ltd.
//
//   Portions created by LShift Ltd are Copyright (C) 2007-2010 LShift
//   Ltd. Portions created by Cohesive Financial Technologies LLC are
//   Copyright (C) 2007-2010 Cohesive Financial Technologies
//   LLC. Portions created by Rabbit Technologies Ltd are Copyright
//   (C) 2007-2010 Rabbit Technologies Ltd.
//
//   All Rights Reserved.
//
//   Contributor(s): ______________________________________.
//

package com.rabbitmq.client.test.functional;

import com.rabbitmq.client.test.Bug20004Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FunctionalTests extends TestCase {
    public static TestSuite suite() {
        TestSuite suite = new TestSuite("functional");
        suite.addTestSuite(ConnectionOpen.class);
        suite.addTestSuite(Tables.class);
        suite.addTestSuite(DoubleDeletion.class);
        suite.addTestSuite(Routing.class);
        suite.addTestSuite(BindingLifecycle.class);
        suite.addTestSuite(Recover.class);
        suite.addTestSuite(TransactionalRecover.class);
        suite.addTestSuite(Transactions.class);
        suite.addTestSuite(PersistentTransactions.class);
        suite.addTestSuite(RequeueOnConnectionClose.class);
        suite.addTestSuite(RequeueOnChannelClose.class);
        suite.addTestSuite(NoRequeueOnCancel.class);
        suite.addTestSuite(Bug20004Test.class);
        suite.addTestSuite(ExchangeDeleteIfUnused.class);
        suite.addTestSuite(QosTests.class);
        suite.addTestSuite(AlternateExchange.class);
        suite.addTestSuite(ExchangeDeclare.class);
        suite.addTestSuite(FrameMax.class);
        suite.addTestSuite(QueueLifecycle.class);
        suite.addTestSuite(QueueExclusivity.class);
        suite.addTestSuite(InvalidAcks.class);
        suite.addTestSuite(InvalidAcksTx.class);
        suite.addTestSuite(UnexpectedFrames.class);
        return suite;
    }
}
