package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rcj extends rdt {
    private final Context a;
    private String d;
    private final Object c = new Object();
    private final rds b = new rcq(null);

    public rcj(qqe qqeVar) {
        this.a = (Context) qqeVar.a;
    }

    private final boolean m(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    private static final void n() throws rcs {
        throw new rcs("Android backend cannot perform remote operations without a remote backend");
    }

    @Override // defpackage.rdt
    protected final Uri a(Uri uri) throws rcu {
        try {
            Context context = this.a;
            Pattern pattern = rcl.a;
            rck rckVar = new rck(context);
            rckVar.b(uri.getPath());
            return rckVar.a();
        } catch (IllegalArgumentException e) {
            throw new rcu(e);
        }
    }

    @Override // defpackage.rdt
    protected final Uri b(Uri uri) throws rcu {
        if (m(uri)) {
            throw new rcu("Operation across authorities is not allowed.");
        }
        File fileD = d(uri);
        Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path("/");
        int i = sbp.d;
        sbk sbkVar = new sbk();
        builderPath.path(fileD.getAbsolutePath());
        return qpt.Y(builderPath, sbkVar);
    }

    @Override // defpackage.rdt
    protected final rds c() {
        return this.b;
    }

    @Override // defpackage.rdt, defpackage.rds
    public final File d(Uri uri) throws IOException {
        String str;
        if (m(uri)) {
            throw new IOException("operation is not permitted in other authorities.");
        }
        Context context = this.a;
        File fileZ = qpt.Z(uri, context);
        if (!prt.g(context)) {
            synchronized (this.c) {
                if (this.d == null) {
                    this.d = qpt.aa(context).getAbsolutePath();
                }
                str = this.d;
            }
            if (!fileZ.getAbsolutePath().startsWith(str)) {
                throw new rcs("Cannot access credential-protected data from direct boot");
            }
        }
        return fileZ;
    }

    @Override // defpackage.rdt, defpackage.rds
    public final InputStream e(Uri uri) throws rcs {
        if (!m(uri)) {
            return this.b.e(b(uri));
        }
        n();
        throw null;
    }

    @Override // defpackage.rds
    public final String f() {
        return "android";
    }

    @Override // defpackage.rdt, defpackage.rds
    public final boolean g(Uri uri) throws rcs {
        if (!m(uri)) {
            return this.b.g(b(uri));
        }
        n();
        throw null;
    }
}
