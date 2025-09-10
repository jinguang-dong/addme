package com.google.android.apps.camera.debug.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.camera.debug.contentprovider.DebugContentProvider;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import defpackage.hbc;
import defpackage.hbj;
import defpackage.hcy;
import defpackage.hdd;
import defpackage.hde;
import defpackage.ink;
import defpackage.mej;
import defpackage.met;
import defpackage.rww;
import defpackage.sgt;
import defpackage.sgv;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DebugContentProvider extends ContentProvider {
    private static final sgv c = sgv.g("com.google.android.apps.camera.debug.contentprovider.DebugContentProvider");
    public hbc a;
    public hbj b;
    private hde d;

    public static final List a(Class cls, Predicate predicate) {
        Instrumentation instrumentationInstance;
        try {
            instrumentationInstance = Instrumentation.instance();
        } catch (NullPointerException unused) {
            instrumentationInstance = null;
        }
        if (instrumentationInstance != null) {
            return (List) Collection.EL.stream(instrumentationInstance.b(cls)).filter(predicate).collect(Collectors.toList());
        }
        ((sgt) c.b().M(1178)).s("Could not get an instance of the instrumentation.");
        return new ArrayList();
    }

    private final synchronized hde b() {
        if (this.d == null) {
            Context context = getContext();
            context.getClass();
            hde hdeVar = new hde(String.valueOf(context.getPackageName()).concat(".DebugContentProvider"));
            final int i = 1;
            hdeVar.b("startup_timing_latest", mej.class, new hdd() { // from class: hcx
                @Override // defpackage.rww
                public final Object fr() {
                    return i != 0 ? DebugContentProvider.a(CameraActivityTiming.class, new fla(15)) : DebugContentProvider.a(meu.class, new fla(16));
                }
            });
            final int i2 = 0;
            hdeVar.b("shutter_lag_latest", met.class, new hdd() { // from class: hcx
                @Override // defpackage.rww
                public final Object fr() {
                    return i2 != 0 ? DebugContentProvider.a(CameraActivityTiming.class, new fla(15)) : DebugContentProvider.a(meu.class, new fla(16));
                }
            });
            this.d = hdeVar;
        }
        return this.d;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        ((sgt) c.b().M(1176)).s("Delete not supported for DebugContentProvider.");
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [sgt, shi] */
    @Override // android.content.ContentProvider
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        try {
            if (this.a == null) {
                Context context = getContext();
                context.getClass();
                ((hcy) ((ink) context.getApplicationContext()).d(hcy.class)).c(this);
            }
            printWriter.printf("Build flavor: %s", this.a.name());
            printWriter.println();
            printWriter.println();
            hde hdeVarB = b();
            printWriter.printf("%s,%s,%s,%s,%s", "path", "_id", "run", "name", "time_ns");
            printWriter.println();
            for (Map.Entry entry : hdeVarB.e.entrySet()) {
                Cursor cursorA = hdeVarB.a((hdd) entry.getValue(), true, hde.b);
                while (cursorA.moveToNext()) {
                    try {
                        printWriter.printf("%s,%d,%d,%s,%d", entry.getKey(), Integer.valueOf(cursorA.getInt(cursorA.getColumnIndex("_id"))), Integer.valueOf(cursorA.getInt(cursorA.getColumnIndex("run"))), cursorA.getString(cursorA.getColumnIndex("name")), Long.valueOf(cursorA.getLong(cursorA.getColumnIndex("time_ns"))));
                        printWriter.println();
                    } finally {
                    }
                }
                cursorA.close();
            }
            if (this.b != null) {
                printWriter.println();
            }
        } catch (Exception e) {
            ((sgt) ((sgt) c.b().i(e)).M((char) 1177)).s("Dump exception");
        }
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        ((sgt) c.b().M(1179)).s("Insert not supported for DebugContentProvider.");
        throw new IllegalArgumentException();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [sgt, shi] */
    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String callingPackage = getCallingPackage();
        if (callingPackage == null || !("com.android.shell".equals(callingPackage) || "root".equals(callingPackage))) {
            throw new IllegalArgumentException();
        }
        try {
            hde hdeVarB = b();
            rww rwwVar = (rww) hdeVarB.d.get(Integer.valueOf(hdeVarB.c.match(uri)));
            if (rwwVar != null) {
                return (Cursor) rwwVar.fr();
            }
            ((sgt) hde.a.b().M(1183)).v("bad uri %s", uri);
            return null;
        } catch (Exception e) {
            ((sgt) ((sgt) c.b().i(e)).M((char) 1180)).s("Query exception");
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        ((sgt) c.b().M(1181)).s("Update not supported for DebugContentProvider.");
        throw new IllegalArgumentException();
    }
}
