package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class erh implements eqv {
    private final Uri a;
    private final ContentResolver b;
    private Object c;

    public erh(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.a = uri;
    }

    protected abstract Object b(Uri uri, ContentResolver contentResolver);

    protected abstract void c(Object obj);

    @Override // defpackage.eqv
    public final void d() {
        Object obj = this.c;
        if (obj != null) {
            try {
                c(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.eqv
    public final void f(epb epbVar, equ equVar) {
        try {
            Object objB = b(this.a, this.b);
            this.c = objB;
            equVar.b(objB);
        } catch (FileNotFoundException e) {
            equVar.e(e);
        }
    }

    @Override // defpackage.eqv
    public final int g() {
        return 1;
    }

    @Override // defpackage.eqv
    public final void dE() {
    }
}
