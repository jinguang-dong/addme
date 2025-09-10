package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qif extends qiu {
    protected qif(qin qinVar, qgf qgfVar) {
        super(qinVar, qgfVar);
    }

    public static qif b(qin qinVar, int i, ByteBuffer byteBuffer) {
        return new qif(qinVar, qiu.f(qinVar, new qie(qinVar, i, byteBuffer)));
    }

    public final String toString() {
        return "GLBuffer{" + ((qjx) i()).toString() + "}";
    }
}
