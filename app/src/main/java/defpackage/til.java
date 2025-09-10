package defpackage;

import java.io.IOException;
import java.io.StringWriter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class til {
    @Deprecated
    public til() {
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            tmm tmmVar = new tmm(stringWriter);
            tmmVar.d = 1;
            ((tkh) tma.T).c(tmmVar, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
