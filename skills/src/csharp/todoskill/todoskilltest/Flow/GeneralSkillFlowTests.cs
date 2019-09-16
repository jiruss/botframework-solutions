﻿using System;
using System.Collections.Generic;
using System.Collections.Specialized;
using System.Text;
using System.Threading.Tasks;
using Microsoft.Bot.Schema;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using ToDoSkill.Responses.Main;
using ToDoSkillTest.Flow.Utterances;

namespace ToDoSkillTest.Flow
{
    [TestClass]
    public class GeneralSkillFlowTests : ToDoBotTestBase
    {
        [TestMethod]
        public async Task Test_SingleTurnCompletion()
        {
            await this.GetTestFlow()
                .Send(GeneralTestUtterances.UnknownIntent)
                .AssertReplyOneOf(this.ConfusedResponse())
                .AssertReply((activity) => { Assert.AreEqual(ActivityTypes.Handoff, activity.Type); })
                .StartTestAsync();
        }

        private string[] ConfusedResponse()
        {
            return this.ParseReplies(ToDoMainResponses.DidntUnderstandMessage, new StringDictionary());
        }
    }
}
