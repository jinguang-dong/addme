package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class tpz extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public tpz(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void a() {
        this.a = true;
    }

    public tpz(String str) {
        super(str);
    }

    public tpz(String str, IOException iOException) {
        super(str, iOException);
    }
}
