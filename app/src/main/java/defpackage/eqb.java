package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eqb extends IOException {
    private static final long serialVersionUID = 1;

    public eqb(String str, int i) {
        this(str, i, null);
    }

    public eqb(String str, int i, Throwable th) {
        super(str + ", status code: " + i, th);
    }
}
