package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class rdt implements rds {
    protected Uri a(Uri uri) {
        throw null;
    }

    protected Uri b(Uri uri) {
        throw null;
    }

    protected abstract rds c();

    @Override // defpackage.rds
    public /* synthetic */ File d(Uri uri) {
        throw null;
    }

    @Override // defpackage.rds
    public InputStream e(Uri uri) {
        throw null;
    }

    @Override // defpackage.rds
    public boolean g(Uri uri) {
        throw null;
    }

    @Override // defpackage.rds
    public final void h(Uri uri) {
        c().h(b(uri));
    }

    @Override // defpackage.rds
    public final void i(Uri uri) {
        c().i(b(uri));
    }

    @Override // defpackage.rds
    public final void j(Uri uri) {
        c().j(b(uri));
    }

    @Override // defpackage.rds
    public final void k(Uri uri, Uri uri2) {
        c().k(b(uri), b(uri2));
    }

    @Override // defpackage.rds
    public final boolean l(Uri uri) {
        return c().l(b(uri));
    }

    @Override // defpackage.rds
    public final long o(Uri uri) {
        return c().o(b(uri));
    }

    @Override // defpackage.rds
    public final OutputStream p(Uri uri) {
        return c().p(b(uri));
    }

    @Override // defpackage.rds
    public final Iterable q(Uri uri) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c().q(b(uri)).iterator();
        while (it.hasNext()) {
            arrayList.add(a((Uri) it.next()));
        }
        return arrayList;
    }
}
