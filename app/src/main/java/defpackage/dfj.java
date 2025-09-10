package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfj implements dfa {
    public final SQLiteDatabase d;
    public static final String[] a = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] e = new String[0];
    public static final ues b = rnt.aO(3, new bfw(10));
    public static final ues c = rnt.aO(3, new bfw(11));

    public dfj(SQLiteDatabase sQLiteDatabase) {
        this.d = sQLiteDatabase;
    }

    @Override // defpackage.dfa
    public final Cursor a(dfg dfgVar) {
        final dfh dfhVar = new dfh(dfgVar, 0);
        Cursor cursorRawQueryWithFactory = this.d.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: dfi
            /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor, java.lang.Object] */
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                String[] strArr = dfj.a;
                return dfhVar.e(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, dfgVar.b(), e, null);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }

    @Override // defpackage.dfa
    public final Cursor b(String str) {
        return a(new dez(str));
    }

    @Override // defpackage.dfa
    public final String c() {
        return this.d.getPath();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // defpackage.dfa
    public final void d() {
        this.d.beginTransaction();
    }

    @Override // defpackage.dfa
    public final void e() {
        this.d.beginTransactionNonExclusive();
    }

    @Override // defpackage.dfa
    public final void f() {
        this.d.endTransaction();
    }

    @Override // defpackage.dfa
    public final void g(String str) throws SQLException {
        this.d.execSQL(str);
    }

    @Override // defpackage.dfa
    public final void h() {
        this.d.setTransactionSuccessful();
    }

    @Override // defpackage.dfa
    public final boolean i() {
        return this.d.inTransaction();
    }

    @Override // defpackage.dfa
    public final boolean j() {
        return this.d.isOpen();
    }

    @Override // defpackage.dfa
    public final dfq k(String str) throws SQLException {
        SQLiteStatement sQLiteStatementCompileStatement = this.d.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new dfq(sQLiteStatementCompileStatement);
    }

    @Override // defpackage.dfa
    public final void l(Object[] objArr) throws SQLException {
        this.d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }
}
