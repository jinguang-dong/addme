package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ujf implements Serializable {
    public static final ujf a = new ujf();

    private Object readResolve() {
        return a;
    }
}
