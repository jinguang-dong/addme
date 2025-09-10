package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfm extends SQLiteOpenHelper {
    private final Context a;
    private final dfb b;
    private final boolean c;
    private boolean d;
    private final dfr e;
    private boolean f;
    private final sgh g;

    public dfm(Context context, String str, final sgh sghVar, dfb dfbVar, boolean z) {
        String string;
        super(context, str, null, dfbVar.b, new DatabaseErrorHandler() { // from class: dfk
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.getClass();
                dfj dfjVarR = cog.r(sghVar, sQLiteDatabase);
                Log.e("SupportSQLite", a.bz(dfjVarR, "Corruption reported by sqlite on database: ", ".path"));
                if (!dfjVarR.j()) {
                    String strC = dfjVarR.c();
                    if (strC != null) {
                        dfb.f(strC);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = dfjVarR.d.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        dfjVarR.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs == null) {
                        String strC2 = dfjVarR.c();
                        if (strC2 != null) {
                            dfb.f(strC2);
                            return;
                        }
                        return;
                    }
                    Iterator<T> it = attachedDbs.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        obj.getClass();
                        dfb.f((String) obj);
                    }
                } catch (Throwable th) {
                    if (attachedDbs != null) {
                        Iterator<T> it2 = attachedDbs.iterator();
                        while (it2.hasNext()) {
                            Object obj2 = ((Pair) it2.next()).second;
                            obj2.getClass();
                            dfb.f((String) obj2);
                        }
                    } else {
                        String strC3 = dfjVarR.c();
                        if (strC3 != null) {
                            dfb.f(strC3);
                        }
                    }
                    throw th;
                }
            }
        });
        this.a = context;
        this.g = sghVar;
        this.b = dfbVar;
        this.c = z;
        if (str == null) {
            string = UUID.randomUUID().toString();
            string.getClass();
        } else {
            string = str;
        }
        this.e = new dfr(string, context.getCacheDir());
    }

    private final SQLiteDatabase c() {
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        writableDatabase.getClass();
        return writableDatabase;
    }

    public final dfj a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        return cog.r(this.g, sQLiteDatabase);
    }

    public final dfa b() {
        SQLiteDatabase sQLiteDatabaseC;
        dfa dfaVarA;
        File parentFile;
        try {
            this.e.a((this.f || getDatabaseName() == null) ? false : true);
            this.d = false;
            String databaseName = getDatabaseName();
            boolean z = this.f;
            if (databaseName != null && !z && (parentFile = this.a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Objects.toString(parentFile);
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: ".concat(parentFile.toString()));
                }
            }
            try {
                sQLiteDatabaseC = c();
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    sQLiteDatabaseC = c();
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof dfl) {
                        dfl dflVar = (dfl) th;
                        Throwable th2 = dflVar.a;
                        int i = dflVar.b;
                        int i2 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) {
                            throw th2;
                        }
                        if (i2 != 4) {
                            throw new uet();
                        }
                        if (!(th2 instanceof SQLiteException)) {
                            throw th2;
                        }
                        th = th2;
                    }
                    if (!(th instanceof SQLiteException) || databaseName == null || !this.c) {
                        throw th;
                    }
                    this.a.deleteDatabase(databaseName);
                    try {
                        sQLiteDatabaseC = c();
                    } catch (dfl e) {
                        throw e.a;
                    }
                }
            }
            if (this.d) {
                close();
                dfaVarA = b();
            } else {
                dfaVarA = a(sQLiteDatabaseC);
            }
            return dfaVarA;
        } finally {
            this.e.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        try {
            dfr dfrVar = this.e;
            Map map = dfr.a;
            boolean z = dfrVar.b;
            dfrVar.a(false);
            super.close();
            this.g.a = null;
            this.f = false;
        } finally {
            this.e.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.d && this.b.b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            dfb dfbVar = this.b;
            a(sQLiteDatabase);
            dfbVar.e();
        } catch (Throwable th) {
            throw new dfl(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            this.b.a(a(sQLiteDatabase));
        } catch (Throwable th) {
            throw new dfl(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.d = true;
        try {
            this.b.b(a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new dfl(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.d) {
            try {
                this.b.c(a(sQLiteDatabase));
            } catch (Throwable th) {
                throw new dfl(5, th);
            }
        }
        this.f = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.d = true;
        try {
            this.b.d(a(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new dfl(3, th);
        }
    }
}
