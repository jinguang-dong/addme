package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rcm implements rds {
    private final AssetManager a;

    public rcm(qaq qaqVar) {
        this.a = ((Context) qaqVar.a).getAssets();
    }

    private static final String m(Uri uri) {
        rnt.B("asset".equals(uri.getScheme()), "scheme must be 'asset'");
        return uri.getPath().substring(1);
    }

    @Override // defpackage.rds
    public final /* synthetic */ File d(Uri uri) {
        return qsp.b(this, uri);
    }

    @Override // defpackage.rds
    public final InputStream e(Uri uri) {
        return this.a.open(m(uri));
    }

    @Override // defpackage.rds
    public final String f() {
        return "asset";
    }

    @Override // defpackage.rds
    public final boolean g(Uri uri) throws IOException {
        try {
            InputStream inputStreamE = e(uri);
            if (inputStreamE == null) {
                return true;
            }
            inputStreamE.close();
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    @Override // defpackage.rds
    public final /* synthetic */ void h(Uri uri) throws rcw {
        qsp.d(this);
    }

    @Override // defpackage.rds
    public final /* synthetic */ void i(Uri uri) throws rcw {
        qsp.e(this);
    }

    @Override // defpackage.rds
    public final /* synthetic */ void j(Uri uri) throws rcw {
        throw new rcw("deleteFile not supported by asset");
    }

    @Override // defpackage.rds
    public final /* synthetic */ void k(Uri uri, Uri uri2) throws rcw {
        qsp.f(this);
    }

    @Override // defpackage.rds
    public final boolean l(Uri uri) {
        return false;
    }

    @Override // defpackage.rds
    public final long o(Uri uri) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenFd = this.a.openFd(m(uri));
        try {
            long length = assetFileDescriptorOpenFd.getLength();
            if (assetFileDescriptorOpenFd != null) {
                assetFileDescriptorOpenFd.close();
            }
            return length;
        } catch (Throwable th) {
            if (assetFileDescriptorOpenFd != null) {
                try {
                    assetFileDescriptorOpenFd.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.rds
    public final /* synthetic */ OutputStream p(Uri uri) throws rcw {
        throw new rcw("openForWrite not supported by asset");
    }

    @Override // defpackage.rds
    public final /* synthetic */ Iterable q(Uri uri) {
        return qsp.c(this);
    }
}
