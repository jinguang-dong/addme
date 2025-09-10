package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oll extends SQLiteOpenHelper {
    final /* synthetic */ oav a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oll(oav oavVar, Context context) {
        super(context, "google_analytics_v4.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.a = oavVar;
        int i = oln.a;
        lpa lpaVar = olk.a;
    }

    private final boolean a(SQLiteDatabase sQLiteDatabase, String str) {
        boolean zMoveToFirst;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                zMoveToFirst = cursorQuery.moveToFirst();
            } catch (SQLiteException e) {
                this.a.v("Error querying for table", str, e);
                zMoveToFirst = false;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return zMoveToFirst;
        } finally {
        }
    }

    private static Set b(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(a.bw(str, "SELECT * FROM ", " LIMIT 0"), null);
        try {
            for (String str2 : cursorRawQuery.getColumnNames()) {
                hashSet.add(str2);
            }
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        if (!this.a.e.c(3600000L)) {
            throw new SQLiteException("Database open failed");
        }
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException unused) {
            oav oavVar = this.a;
            obv obvVar = oavVar.e;
            obvVar.b();
            oavVar.n("Opening the database failed, dropping the table and recreating it");
            oavVar.d().getDatabasePath("google_analytics_v4.db").delete();
            try {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                obvVar.a();
                return writableDatabase;
            } catch (SQLiteException e) {
                this.a.o("Failed to open freshly created database", e);
                throw e;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        String path = sQLiteDatabase.getPath();
        try {
            if (Integer.parseInt(Build.VERSION.SDK) < 9) {
                return;
            }
            lpa lpaVar = olk.a;
            int i = oln.a;
            File file = new File(path);
            file.setReadable(false, false);
            file.setWritable(false, false);
            file.setReadable(true, true);
            file.setWritable(true, true);
        } catch (NumberFormatException unused) {
            String str = Build.VERSION.SDK;
            rfv rfvVar = obl.a;
            obm obmVar = obm.a;
            if (obmVar != null) {
                obmVar.o("Invalid version number", str);
            } else if (obl.a != null) {
                int i2 = obl.a.a;
                Log.e((String) obh.b.f(), str != null ? "Invalid version number:".concat(str) : "Invalid version number");
            }
            rfv rfvVar2 = obl.a;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws SQLException {
        if (a(sQLiteDatabase, "hits2")) {
            Set setB = b(sQLiteDatabase, "hits2");
            String[] strArr = {"hit_id", "hit_string", "hit_time", "hit_url"};
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (!setB.remove(str)) {
                    throw new SQLiteException("Database hits2 is missing required column: ".concat(String.valueOf(str)));
                }
            }
            boolean zRemove = setB.remove("hit_app_id");
            if (!setB.isEmpty()) {
                throw new SQLiteException("Database hits2 has extra columns");
            }
            if (!zRemove) {
                sQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
            }
        } else {
            sQLiteDatabase.execSQL(oav.a);
        }
        if (!a(sQLiteDatabase, "properties")) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
            return;
        }
        Set setB2 = b(sQLiteDatabase, "properties");
        String[] strArr2 = {"app_uid", "cid", "tid", "params", "adid", "hits_count"};
        for (int i2 = 0; i2 < 6; i2++) {
            String str2 = strArr2[i2];
            if (!setB2.remove(str2)) {
                throw new SQLiteException("Database properties is missing required column: ".concat(String.valueOf(str2)));
            }
        }
        if (!setB2.isEmpty()) {
            throw new SQLiteException("Database properties table has extra columns");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
