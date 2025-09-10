package defpackage;

import java.io.Serializable;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sbi implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumSet a;

    public sbi(EnumSet enumSet) {
        this.a = enumSet;
    }

    Object readResolve() {
        return new sbj(this.a.clone());
    }
}
