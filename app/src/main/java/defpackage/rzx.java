package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rzx implements Serializable {
    private static final long serialVersionUID = 0;
    private final rzw a;

    public rzx(rzw rzwVar) {
        this.a = rzwVar;
    }

    private Object readResolve() {
        return new rzy(this.a);
    }
}
