package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class evc implements eqv {
    private static final String[] a = {"_data"};
    private final Context b;
    private final Uri c;

    public evc(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }

    @Override // defpackage.eqv
    public final Class a() {
        return File.class;
    }

    @Override // defpackage.eqv
    public final void f(epb epbVar, equ equVar) {
        Cursor cursorQuery = this.b.getContentResolver().query(this.c, a, null, null, null);
        if (cursorQuery != null) {
            try {
                string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
            } finally {
                cursorQuery.close();
            }
        }
        if (TextUtils.isEmpty(string)) {
            equVar.e(new FileNotFoundException("Failed to find file path for: ".concat(String.valueOf(String.valueOf(this.c)))));
        } else {
            equVar.b(new File(string));
        }
    }

    @Override // defpackage.eqv
    public final int g() {
        return 1;
    }

    @Override // defpackage.eqv
    public final void d() {
    }

    @Override // defpackage.eqv
    public final void dE() {
    }
}
