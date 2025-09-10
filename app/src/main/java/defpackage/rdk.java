package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rdk implements rch {
    private final /* synthetic */ int a;

    public rdk(int i) {
        this.a = i;
    }

    @Override // defpackage.rch
    public final /* synthetic */ Object a(rcg rcgVar) throws IOException {
        int i = this.a;
        if (i == 0) {
            rdl rdlVar = new rdl();
            rdlVar.c();
            File fileA = rdlVar.a(rcgVar);
            rup.h(fileA);
            return new RandomAccessFile(fileA, "rw");
        }
        if (i != 1) {
            ArrayDeque arrayDeque = new ArrayDeque();
            Uri uriBuild = ((Uri) rcgVar.e).buildUpon().fragment(null).build();
            lat latVar = (lat) rcgVar.a;
            ujp.aT(arrayDeque, latVar.l(uriBuild));
            long jK = 0;
            while (!arrayDeque.isEmpty()) {
                Uri uri = (Uri) arrayDeque.remove();
                if (latVar.s(uri)) {
                    ujp.aT(arrayDeque, latVar.l(uri));
                } else {
                    if (!latVar.r(uri)) {
                        throw new FileNotFoundException(String.format("Child %s could not be opened", uri));
                    }
                    jK += latVar.k(uri);
                }
            }
            return Long.valueOf(jK);
        }
        rdl rdlVar2 = new rdl();
        rdlVar2.c();
        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) ((lat) rcgVar.a).m((Uri) rcgVar.f, rdlVar2), 805306368);
        try {
            parcelFileDescriptorOpen.getFd();
            if (parcelFileDescriptorOpen != null) {
                parcelFileDescriptorOpen.close();
            }
            return null;
        } catch (Throwable th) {
            if (parcelFileDescriptorOpen != null) {
                try {
                    parcelFileDescriptorOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
