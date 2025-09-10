package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oxr extends IOException {
    public oxr(oxs oxsVar) {
        super("Incompatible codec for P11 with mime ".concat(String.valueOf(String.valueOf(oxsVar))));
    }

    public oxr(oxs oxsVar, Throwable th) {
        super("fail to create media codec with mime ".concat(String.valueOf(String.valueOf(oxsVar))), th);
    }
}
