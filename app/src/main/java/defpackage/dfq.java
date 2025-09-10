package defpackage;

import android.database.sqlite.SQLiteStatement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfq extends dfp implements dff {
    public final SQLiteStatement a;

    public dfq(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.a = sQLiteStatement;
    }

    public final void a() {
        this.a.executeUpdateDelete();
    }
}
