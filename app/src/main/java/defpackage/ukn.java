package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ukn implements Serializable {
    public static final ukn a = new ukn();
    private static final long serialVersionUID = 0;

    private ukn() {
    }

    private final Object readResolve() {
        return ukp.a;
    }
}
