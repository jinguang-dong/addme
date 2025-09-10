package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class evw implements eqv {
    private static final String[] a = {"_data"};
    private final Context b;
    private final evg c;
    private final evg d;
    private final Uri e;
    private final int f;
    private final int g;
    private final eqm h;
    private final Class i;
    private volatile boolean j;
    private volatile eqv k;

    public evw(Context context, evg evgVar, evg evgVar2, Uri uri, int i, int i2, eqm eqmVar, Class cls) {
        this.b = context.getApplicationContext();
        this.c = evgVar;
        this.d = evgVar2;
        this.e = uri;
        this.f = i;
        this.g = i2;
        this.h = eqmVar;
        this.i = cls;
    }

    @Override // defpackage.eqv
    public final Class a() {
        return this.i;
    }

    @Override // defpackage.eqv
    public final void d() {
        eqv eqvVar = this.k;
        if (eqvVar != null) {
            eqvVar.d();
        }
    }

    @Override // defpackage.eqv
    public final void dE() {
        this.j = true;
        eqv eqvVar = this.k;
        if (eqvVar != null) {
            eqvVar.dE();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [eqv] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    @Override // defpackage.eqv
    public final void f(epb epbVar, equ equVar) throws Throwable {
        tdy tdyVarB;
        Throwable th;
        try {
            Cursor cursor = null;
            if (Environment.isExternalStorageLegacy()) {
                evg evgVar = this.c;
                Uri uri = this.e;
                try {
                    Cursor cursorQuery = this.b.getContentResolver().query(uri, a, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException(eld.b(uri, "File path was empty in media store for: "));
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                tdyVarB = evgVar.b(file, this.f, this.g, this.h);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                            if (cursor == null) {
                                throw th;
                            }
                            cursor.close();
                            throw th;
                        }
                    }
                    throw new FileNotFoundException(eld.b(uri, "Failed to media store entry for: "));
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                Uri requireOriginal = this.e;
                if (eoy.a(requireOriginal) && requireOriginal.getPathSegments().contains("picker")) {
                    tdyVarB = this.d.b(requireOriginal, this.f, this.g, this.h);
                } else {
                    if (this.b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                        requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                    }
                    tdyVarB = this.d.b(requireOriginal, this.f, this.g, this.h);
                }
            }
            ?? r2 = tdyVarB != null ? tdyVarB.b : 0;
            if (r2 == 0) {
                equVar.e(new IllegalArgumentException("Failed to build fetcher for: " + String.valueOf(this.e)));
                return;
            }
            this.k = r2;
            if (this.j) {
                dE();
            } else {
                r2.f(epbVar, equVar);
            }
        } catch (FileNotFoundException e) {
            equVar.e(e);
        }
    }

    @Override // defpackage.eqv
    public final int g() {
        return 1;
    }
}
