package defpackage;

import android.net.Uri;
import android.os.Process;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rdq implements rch {
    public sdy[] a;
    private final tqr b;

    public rdq(tqr tqrVar) {
        this.b = tqrVar;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, rds] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, rds] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, rds] */
    @Override // defpackage.rch
    public final /* synthetic */ Object a(rcg rcgVar) throws IOException {
        AtomicLong atomicLong = rdp.a;
        String str = ".mobstore_tmp-" + Process.myPid() + "-" + Thread.currentThread().getId() + "-" + System.currentTimeMillis() + "-" + rdp.a.getAndIncrement();
        Uri uri = (Uri) rcgVar.f;
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(str)).build();
        List listA = rcgVar.a(rcgVar.b.p(uriBuild));
        sdy[] sdyVarArr = this.a;
        if (sdyVarArr != null) {
            sdyVarArr[0].c(listA);
        }
        try {
            OutputStream outputStream = (OutputStream) listA.get(0);
            try {
                this.b.g(outputStream);
                sdy[] sdyVarArr2 = this.a;
                if (sdyVarArr2 != null) {
                    sdyVarArr2[0].d();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                rcgVar.b.k(uriBuild, (Uri) rcgVar.f);
                return null;
            } finally {
            }
        } catch (Exception e) {
            try {
                rcgVar.b.j(uriBuild);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }
}
