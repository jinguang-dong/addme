package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eut implements eqv {
    private Object a;
    private final /* synthetic */ int b;
    private final Object c;
    private final Object d;

    public eut(Uri uri, gga ggaVar, int i) {
        this.b = i;
        this.d = uri;
        this.c = ggaVar;
    }

    public static eut b(Context context, Uri uri, ero eroVar) {
        return new eut(uri, new gga(eox.b(context).b.b().b(), eroVar, eox.b(context).d, context.getContentResolver()), 1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [euu, java.lang.Object] */
    @Override // defpackage.eqv
    public final Class a() {
        return this.b != 0 ? InputStream.class : this.d.a();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [euu, java.lang.Object] */
    @Override // defpackage.eqv
    public final void d() throws IOException {
        try {
            if (this.b != 0) {
                Object obj = this.a;
                if (obj != null) {
                    ((InputStream) obj).close();
                    return;
                }
                return;
            }
            Object obj2 = this.a;
            if (obj2 != null) {
                this.d.c(obj2);
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043 A[Catch: FileNotFoundException -> 0x00c0, TryCatch #0 {FileNotFoundException -> 0x00c0, blocks: (B:4:0x0004, B:11:0x0022, B:24:0x003b, B:39:0x007f, B:52:0x00b4, B:53:0x00ba, B:47:0x00ab, B:27:0x0043, B:29:0x004e, B:31:0x0058, B:32:0x005c, B:35:0x0068, B:36:0x007b, B:15:0x002b, B:18:0x0032, B:19:0x0035, B:40:0x0083), top: B:67:0x0004, inners: #2, #10, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f A[Catch: FileNotFoundException -> 0x00c0, TRY_LEAVE, TryCatch #0 {FileNotFoundException -> 0x00c0, blocks: (B:4:0x0004, B:11:0x0022, B:24:0x003b, B:39:0x007f, B:52:0x00b4, B:53:0x00ba, B:47:0x00ab, B:27:0x0043, B:29:0x004e, B:31:0x0058, B:32:0x005c, B:35:0x0068, B:36:0x007b, B:15:0x002b, B:18:0x0032, B:19:0x0035, B:40:0x0083), top: B:67:0x0004, inners: #2, #10, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4 A[Catch: FileNotFoundException -> 0x00c0, TRY_ENTER, TryCatch #0 {FileNotFoundException -> 0x00c0, blocks: (B:4:0x0004, B:11:0x0022, B:24:0x003b, B:39:0x007f, B:52:0x00b4, B:53:0x00ba, B:47:0x00ab, B:27:0x0043, B:29:0x004e, B:31:0x0058, B:32:0x005c, B:35:0x0068, B:36:0x007b, B:15:0x002b, B:18:0x0032, B:19:0x0035, B:40:0x0083), top: B:67:0x0004, inners: #2, #10, #12 }] */
    /* JADX WARN: Type inference failed for: r2v15, types: [ero, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [euu, java.lang.Object] */
    @Override // defpackage.eqv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.epb r8, defpackage.equ r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eut.f(epb, equ):void");
    }

    @Override // defpackage.eqv
    public final int g() {
        return 1;
    }

    public eut(File file, euu euuVar, int i) {
        this.b = i;
        this.c = file;
        this.d = euuVar;
    }

    @Override // defpackage.eqv
    public final void dE() {
    }
}
