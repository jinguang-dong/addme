package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hqr implements rvu {
    final /* synthetic */ ContentValues a;

    public hqr(ContentValues contentValues) {
        this.a = contentValues;
    }

    @Override // defpackage.rvu
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        sQLiteDatabase.getClass();
        sQLiteDatabase.replace("type_uri", null, this.a);
        return null;
    }
}
