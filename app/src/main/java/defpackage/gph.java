package defpackage;

import android.database.sqlite.SQLiteException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gph implements Runnable {
    private final pbc a;
    private final Boolean b = false;
    private final Runnable c;

    public gph(pbc pbcVar, Runnable runnable) {
        this.a = pbcVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.c.run();
        } catch (SQLiteException e) {
            this.a.e(ojl.bI("SQLite error while recording fatal error", new Object[0]), e);
            this.b.booleanValue();
        }
    }
}
