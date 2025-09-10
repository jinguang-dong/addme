package defpackage;

import android.graphics.Bitmap;
import android.location.Location;
import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.dirtylens.PrCd.SHXc;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lrx implements lss {
    private static final sgv b = sgv.g("lrx");
    private final mdm c;
    private final String d;
    private final long e;
    private final fse f;
    private final szh h;
    private final fee i;
    private final Supplier j;
    private icv g = icv.b().i();
    private int k = -1;
    private boolean l = false;
    public final ltd a = ltd.a();

    public lrx(String str, long j, fse fseVar, mdm mdmVar, szh szhVar, fee feeVar, Supplier supplier) {
        this.d = str;
        this.e = j;
        this.f = fseVar;
        this.c = mdmVar;
        this.j = supplier;
        rnt.M(!szhVar.isDone(), "SettableFuture for image data is already set before the session started");
        this.h = szhVar;
        this.i = feeVar;
    }

    @Override // defpackage.lss
    public final void A(Throwable th) {
    }

    @Override // defpackage.lss
    public final void C() {
    }

    @Override // defpackage.lss
    public final void D() {
    }

    @Override // defpackage.lss
    public final void E() {
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [sgt, shi] */
    @Override // defpackage.lss
    public final void F(nfm nfmVar, Throwable th) {
        ((sgt) ((sgt) b.c().i(th)).M((char) 4356)).s("Error in Intent session.");
        this.h.a(th);
    }

    @Override // defpackage.lss
    public final void G(boolean z, boolean z2) {
    }

    @Override // defpackage.lss
    public final void H() {
    }

    @Override // defpackage.lss
    public final void I() {
    }

    @Override // defpackage.lss
    public final /* synthetic */ void J(String str) {
    }

    @Override // defpackage.lss
    public final void R() {
    }

    @Override // defpackage.lss
    public final void S() {
    }

    @Override // defpackage.lss
    public final void T(pjo pjoVar) {
        this.k = this.i.c(pjoVar);
        this.l = ((Boolean) this.j.get()).booleanValue();
    }

    @Override // defpackage.lss
    public final /* synthetic */ void U(byte[] bArr, mfo mfoVar, lsu lsuVar) {
        lpa.o();
    }

    @Override // defpackage.lss
    public final void V(icv icvVar) {
        this.g = icvVar;
    }

    @Override // defpackage.lss
    public final synchronized void X(nfm nfmVar) {
    }

    @Override // defpackage.lss
    public final synchronized void Z(pas pasVar) {
    }

    @Override // defpackage.lln
    public final synchronized par a() {
        return par.b;
    }

    @Override // defpackage.lss
    public final /* synthetic */ void aa(long j) {
    }

    @Override // defpackage.lss
    public final /* synthetic */ void ab() {
        lpa.k(this);
    }

    @Override // defpackage.lss
    public final void ac(Integer num) {
    }

    @Override // defpackage.lss
    public final void ae(Bitmap bitmap, int i) {
    }

    @Override // defpackage.lss
    public final void af(Bitmap bitmap) {
    }

    @Override // defpackage.lss
    public final /* synthetic */ void ag(Bitmap bitmap, int i) {
    }

    @Override // defpackage.lss
    public final boolean ah() {
        return this.l;
    }

    @Override // defpackage.lss
    public final boolean ai() {
        return false;
    }

    @Override // defpackage.lss
    public final void aj() {
    }

    @Override // defpackage.lss
    public final void ak() {
    }

    @Override // defpackage.lss
    public final void am(int i) {
    }

    @Override // defpackage.lss
    public final void an(ggg gggVar) {
    }

    @Override // defpackage.lln
    public final void b(Throwable th) {
    }

    @Override // defpackage.lln
    public final synchronized void c(par parVar) {
    }

    @Override // defpackage.lln
    public final void d(llq llqVar) {
    }

    @Override // defpackage.lss
    public final long f() {
        return this.e;
    }

    @Override // defpackage.lss
    public final fse g() {
        return this.f;
    }

    @Override // defpackage.lss
    public final icv h() {
        return this.g;
    }

    @Override // defpackage.lss
    public final lsu j() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.lss
    public final lsw k() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.lss
    public final ltd l() {
        return this.a;
    }

    @Override // defpackage.lss
    public final ltf m() {
        return ltf.IMAGE_INTENT;
    }

    @Override // defpackage.lss
    public final ltg n() {
        return ltg.MEDIA_STORE;
    }

    @Override // defpackage.lss
    public final mdm o() {
        return this.c;
    }

    @Override // defpackage.lss
    public final rwc p() {
        return rvk.a;
    }

    @Override // defpackage.lss
    public final rwc q() {
        return rvk.a;
    }

    @Override // defpackage.lss
    public final syu s() {
        return swz.i(this.h, new kve(this, 4), sxo.a);
    }

    @Override // defpackage.lss
    public final syu t() {
        throw new IllegalStateException("Image Intent session doesn't have a MediaStoreRecord.");
    }

    @Override // defpackage.lss
    public final /* synthetic */ syu v(byte[] bArr, mfo mfoVar, lsu lsuVar) {
        return lpa.n();
    }

    @Override // defpackage.lss
    public final String w() {
        return this.d;
    }

    @Override // defpackage.lss
    public final void y(ltb ltbVar) {
    }

    @Override // defpackage.lss
    public final int e() {
        int i = this.k;
        if (i >= 0) {
            return i;
        }
        ((sgt) b.b().M(4357)).s(SHXc.HEBJ);
        return 90;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [sgt, shi] */
    @Override // defpackage.lss
    public final syu u(byte[] bArr, mfo mfoVar) throws IOException {
        try {
            ExifInterface exifInterface = (ExifInterface) mfoVar.b.f();
            if (exifInterface != null) {
                rwc rwcVarB = this.f.b();
                if (rwcVarB.h()) {
                    pdb pdbVar = new pdb(exifInterface);
                    pdbVar.d((Location) rwcVarB.c());
                    exifInterface = pdbVar.a;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (bArr == null) {
                    throw new IllegalArgumentException(LmJPKwPBa.DyqCTGtgMuUwB);
                }
                sml smlVar = new sml(byteArrayOutputStream);
                try {
                    OutputStream outputStreamM = exifInterface.m(smlVar);
                    try {
                        outputStreamM.write(bArr, 0, bArr.length);
                        outputStreamM.close();
                        smlVar.flush();
                        smlVar.close();
                        bArr = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                    } finally {
                    }
                } finally {
                }
            }
            this.h.e(bArr);
        } catch (IOException e) {
            ((sgt) ((sgt) b.b().i(e)).M((char) 4359)).s("Could not read image bytes.");
            this.h.a(e);
        }
        return ske.M(this.a);
    }
}
