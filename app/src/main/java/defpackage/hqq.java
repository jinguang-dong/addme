package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hqq implements rvu {
    final /* synthetic */ long a;

    public hqq(long j) {
        this.a = j;
    }

    @Override // defpackage.rvu
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        Object objB = rvk.a;
        sQLiteDatabase.getClass();
        Cursor cursorQuery = sQLiteDatabase.query("type_uri", hqs.a, "media_store_id = ?", new String[]{String.valueOf(this.a)}, null, null, null);
        try {
            if (cursorQuery.moveToFirst()) {
                objB = hqp.b(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(mNLbzhCxd.wpxcIWqzgI)));
            }
        } catch (IllegalArgumentException | NullPointerException unused) {
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
        cursorQuery.close();
        return objB;
    }
}
