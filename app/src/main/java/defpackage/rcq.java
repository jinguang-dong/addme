package defpackage;

import android.net.Uri;
import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rcq implements rds {
    public rcq(byte[] bArr) {
    }

    @Override // defpackage.rds
    public final File d(Uri uri) {
        return qpt.X(uri);
    }

    @Override // defpackage.rds
    public final InputStream e(Uri uri) throws rcu {
        File fileX = qpt.X(uri);
        return new rcx(new FileInputStream(fileX), fileX);
    }

    @Override // defpackage.rds
    public final String f() {
        return "file";
    }

    @Override // defpackage.rds
    public final boolean g(Uri uri) {
        return qpt.X(uri).exists();
    }

    @Override // defpackage.rds
    public final void h(Uri uri) throws IOException {
        if (!qpt.X(uri).mkdirs()) {
            throw new IOException(String.format("%s could not be created", uri));
        }
    }

    @Override // defpackage.rds
    public final void i(Uri uri) throws IOException {
        File fileX = qpt.X(uri);
        if (!fileX.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is not a directory", uri));
        }
        if (!fileX.delete()) {
            throw new IOException(String.format("%s could not be deleted", uri));
        }
    }

    @Override // defpackage.rds
    public final void j(Uri uri) throws IOException {
        File fileX = qpt.X(uri);
        if (fileX.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileX.delete()) {
            return;
        }
        if (!fileX.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // defpackage.rds
    public final void k(Uri uri, Uri uri2) throws IOException {
        File fileX = qpt.X(uri);
        File fileX2 = qpt.X(uri2);
        rup.h(fileX2);
        if (!fileX.renameTo(fileX2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // defpackage.rds
    public final boolean l(Uri uri) {
        return qpt.X(uri).isDirectory();
    }

    @Override // defpackage.rds
    public final long o(Uri uri) throws rcu {
        File fileX = qpt.X(uri);
        if (fileX.isDirectory()) {
            return 0L;
        }
        return fileX.length();
    }

    @Override // defpackage.rds
    public final OutputStream p(Uri uri) throws IOException {
        File fileX = qpt.X(uri);
        rup.h(fileX);
        return new rcy(new FileOutputStream(fileX), fileX);
    }

    public rcq() {
        new ConcurrentHashMap();
    }

    @Override // defpackage.rds
    public final Iterable q(Uri uri) throws IOException {
        File fileX = qpt.X(uri);
        if (fileX.isDirectory()) {
            File[] fileArrListFiles = fileX.listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    String absolutePath = file.getAbsolutePath();
                    if (file.isDirectory() && !absolutePath.endsWith("/")) {
                        absolutePath = String.valueOf(absolutePath).concat("/");
                    }
                    Uri.Builder builderPath = new Uri.Builder().scheme("file").authority(CGlJpiVWrCQOq.VmSvPaRIzik).path("/");
                    int i = sbp.d;
                    sbk sbkVar = new sbk();
                    builderPath.path(absolutePath);
                    arrayList.add(qpt.Y(builderPath, sbkVar));
                }
                return arrayList;
            }
            throw new IOException(String.format("Not a directory or I/O error (unexpected): %s", uri));
        }
        throw new FileNotFoundException(String.format("%s is not a directory", uri));
    }
}
