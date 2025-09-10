package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oav extends oao implements Closeable {
    public static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id");
    public static final String c = String.format("SELECT MAX(%s) FROM %s WHERE 1;", "hit_time", "hits2");
    public final obv d;
    public final obv e;
    private final oll f;

    public oav(oar oarVar) {
        super(oarVar);
        this.d = new obv();
        this.e = new obv();
        this.f = new oll(this, oarVar.a);
    }

    final Map C(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                str = mn.g(str, "?");
            }
            URI uri = new URI(str);
            int i = ojj.a;
            Map map = Collections.EMPTY_MAP;
            String rawQuery = uri.getRawQuery();
            if (rawQuery != null && rawQuery.length() > 0) {
                map = new HashMap();
                rwr rwrVarB = rwr.b('=');
                Iterator it = rwr.b('&').a().d(rawQuery).iterator();
                while (it.hasNext()) {
                    List listF = rwrVarB.f((String) it.next());
                    if (listF.isEmpty() || listF.size() > 2) {
                        throw new IllegalArgumentException("bad parameter");
                    }
                    map.put(ojj.a((String) listF.get(0)), listF.size() == 2 ? ojj.a((String) listF.get(1)) : null);
                }
            }
            return map;
        } catch (URISyntaxException e) {
            o("Error parsing hit parameters", e);
            return new HashMap(0);
        }
    }

    public final void D(long j) {
        oak.a();
        z();
        ArrayList arrayList = new ArrayList(1);
        Long lValueOf = Long.valueOf(j);
        arrayList.add(lValueOf);
        r("Deleting hit, id", lValueOf);
        E(arrayList);
    }

    public final void E(List list) {
        oan oanVar;
        ojl.ay(list);
        oak.a();
        z();
        if (list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder("hit_id in (");
        for (int i = 0; i < list.size(); i++) {
            Long l = (Long) list.get(i);
            if (l == null || l.longValue() == 0) {
                throw new SQLiteException("Invalid hit id");
            }
            if (i > 0) {
                sb.append(",");
            }
            sb.append(l);
        }
        sb.append(")");
        String string = sb.toString();
        try {
            SQLiteDatabase sQLiteDatabaseB = b();
            r("Deleting dispatched hits. count", Integer.valueOf(list.size()));
            int iDelete = sQLiteDatabaseB.delete("hits2", string, null);
            if (iDelete != list.size()) {
                oanVar = this;
                try {
                    super.w(5, "Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(iDelete), string);
                } catch (SQLiteException e) {
                    e = e;
                    SQLiteException sQLiteException = e;
                    oanVar.o("Error deleting hits", sQLiteException);
                    throw sQLiteException;
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            oanVar = this;
        }
    }

    public final void F() {
        z();
        b().endTransaction();
    }

    public final void G() {
        z();
        b().setTransactionSuccessful();
    }

    public final boolean H() {
        oak.a();
        z();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = b().rawQuery("SELECT COUNT(*) FROM hits2", null);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return j == 0;
            } catch (SQLiteException e) {
                p("Database error", "SELECT COUNT(*) FROM hits2", e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    final SQLiteDatabase b() {
        try {
            return this.f.getWritableDatabase();
        } catch (SQLiteException e) {
            this.u("Error opening database", e);
            throw e;
        }
    }

    public final List c(long j) {
        oav oavVar;
        a.I(j >= 0);
        oak.a();
        z();
        try {
            try {
                Cursor cursorQuery = b().query("hits2", new String[]{"hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id"}, null, null, null, null, String.format("%s ASC", "hit_id"), Long.toString(j));
                ArrayList arrayList = new ArrayList();
                if (cursorQuery.moveToFirst()) {
                    while (true) {
                        long j2 = cursorQuery.getLong(0);
                        long j3 = cursorQuery.getLong(1);
                        String string = cursorQuery.getString(2);
                        String string2 = cursorQuery.getString(3);
                        oavVar = this;
                        try {
                            arrayList.add(new obj(oavVar, this.C(string), j3, TextUtils.isEmpty(string2) || !string2.startsWith("http:"), j2, cursorQuery.getInt(4)));
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            this = oavVar;
                        } catch (SQLiteException e) {
                            e = e;
                            SQLiteException sQLiteException = e;
                            oavVar.o("Error loading hits from the database", sQLiteException);
                            throw sQLiteException;
                        }
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayList;
            } catch (SQLiteException e2) {
                e = e2;
                oavVar = this;
            }
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f.close();
        } catch (SQLiteException e) {
            o("Sql error closing database", e);
        } catch (IllegalStateException e2) {
            o("Error closing database", e2);
        }
    }

    @Override // defpackage.oao
    protected final void a() {
    }
}
