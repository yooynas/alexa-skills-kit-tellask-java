/**
 * Created by Kay Lerch (https://twitter.com/KayLerch)
 *
 * Contribute to https://github.com/KayLerch/alexa-skills-kit-tellask-java
 *
 * Attached license applies.
 * This source is licensed under GNU GENERAL PUBLIC LICENSE Version 3 as of 29 June 2007
 */
package io.klerch.alexa.tellask.dummies.handler;

import io.klerch.alexa.tellask.model.AlexaInput;
import io.klerch.alexa.tellask.model.AlexaOutput;
import io.klerch.alexa.tellask.schema.AlexaIntentHandler;
import io.klerch.alexa.tellask.schema.annotation.AlexaIntentListener;
import io.klerch.alexa.tellask.util.AlexaRequestHandlerException;

import static io.klerch.alexa.tellask.schema.type.AlexaIntentType.INTENT_ANY;
import static io.klerch.alexa.tellask.schema.type.AlexaIntentType.INTENT_CANCEL;

@AlexaIntentListener(builtInIntents = INTENT_ANY, priority = 3000)
public class SampleHandlerAny implements AlexaIntentHandler {
    @Override
    public boolean verify(AlexaInput alexaInput) {
        return false;
    }

    @Override
    public AlexaOutput handleRequest(final AlexaInput alexaInput) throws AlexaRequestHandlerException {
        return AlexaOutput.ask("Plus").build();
    }

    @Override
    public AlexaOutput handleError(AlexaRequestHandlerException exception) {
        return AlexaOutput.tell("SaySorry").build();
    }
}
