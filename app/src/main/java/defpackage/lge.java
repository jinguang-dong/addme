package defpackage;

import android.content.Context;
import com.google.common.io.ByteStreams;
import com.google.googlex.gcam.BufferUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lge implements lgp {
    private static final sgv a = sgv.g("lge");
    private final Object b = new Object();
    private final tgk c;
    private boolean d;
    private final pbn e;
    private final Context f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final uem k;
    private final uem l;
    private boolean m;

    public lge(pbn pbnVar, Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, uem uemVar, uem uemVar2, tgk tgkVar) {
        this.e = pbnVar;
        this.f = context;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.m = z4;
        this.j = z5;
        this.k = uemVar;
        this.l = uemVar2;
        this.c = tgkVar;
    }

    private final void c(int i) {
        tpc tpcVarM = sta.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sta staVar = (sta) tphVar;
        staVar.c = i - 1;
        staVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        sta staVar2 = (sta) tphVar2;
        staVar2.b |= 2;
        staVar2.d = "tflite_vakunov_multi-subject_2018-06-09.fb.enc";
        boolean z = this.g;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        sta staVar3 = (sta) tphVar3;
        staVar3.b |= 4;
        staVar3.e = z;
        boolean z2 = this.h;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        tph tphVar4 = tpcVarM.b;
        sta staVar4 = (sta) tphVar4;
        staVar4.b |= 8;
        staVar4.f = z2;
        boolean z3 = this.i;
        if (!tphVar4.C()) {
            tpcVarM.o();
        }
        tph tphVar5 = tpcVarM.b;
        sta staVar5 = (sta) tphVar5;
        staVar5.b |= 16;
        staVar5.g = z3;
        boolean z4 = this.m;
        if (!tphVar5.C()) {
            tpcVarM.o();
        }
        tph tphVar6 = tpcVarM.b;
        sta staVar6 = (sta) tphVar6;
        staVar6.b |= 32;
        staVar6.h = z4;
        boolean z5 = this.j;
        if (!tphVar6.C()) {
            tpcVarM.o();
        }
        sta staVar7 = (sta) tpcVarM.b;
        staVar7.b |= 64;
        staVar7.i = z5;
        ((mdy) this.l.a()).o((sta) tpcVarM.l());
    }

    @Override // defpackage.lgp
    public final long a() {
        synchronized (this.b) {
            if (!this.d) {
                return 0L;
            }
            return this.c.getSegmenterHandle();
        }
    }

    @Override // defpackage.lgp
    public final void b() {
        synchronized (this.b) {
            if (!this.d) {
                Context context = this.f;
                this.e.f("PortraitSegmenterManager#loadModelAsset");
                byte[] bArr = new byte[0];
                try {
                    InputStream inputStreamOpen = context.getAssets().open("tflite_vakunov_multi-subject_2018-06-09.fb.enc");
                    int iAvailable = inputStreamOpen.available();
                    byte[] bArr2 = new byte[iAvailable];
                    int i = ByteStreams.read(inputStreamOpen, bArr2, 0, iAvailable);
                    if (inputStreamOpen.available() != 0) {
                        ((sgt) a.b().M(4134)).s("There is more data. This is problematic");
                    }
                    inputStreamOpen.close();
                    if (i != iAvailable) {
                        ((sgt) a.b().M(4133)).s("Didn't finish reading the asset...");
                    }
                    bArr = bArr2;
                } catch (IOException e) {
                    ((sgt) a.b().M(4132)).v("Unable to load the asset: %s", e);
                    c(2);
                }
                pbn pbnVar = this.e;
                pbnVar.g();
                tgk tgkVar = this.c;
                pbnVar.f("PortraitSegmenterManager#decrypt");
                byte[] bArrDoFinal = new byte[0];
                try {
                    smb smbVar = smb.g;
                    byte[] bArrH = smbVar.h("6B63910ECDC9F72F9B907AC6E8E6A53519A194834FB5417CFEB12AD4174286CC");
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(smbVar.h("EE0F689D8C7579BC1A11DEE1D035717E"));
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArrH, "AES");
                    Cipher cipher = Cipher.getInstance("AES_256/CBC/PKCS5Padding");
                    cipher.init(2, secretKeySpec, ivParameterSpec);
                    bArrDoFinal = cipher.doFinal(bArr);
                } catch (Exception e2) {
                    ((sgt) a.b().M(4131)).v("Unable to decrypt bytes: %s", e2);
                    c(3);
                }
                byte[] bArr3 = bArrDoFinal;
                pbn pbnVar2 = this.e;
                pbnVar2.g();
                pbnVar2.f("PortraitSegmenterManager#md5");
                try {
                    byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(bArr3);
                    smb smbVar2 = smb.g;
                    if (!MessageDigest.isEqual(bArrDigest, smbVar2.h("2F01B88911B7897DD738B9CF658A28A6"))) {
                        ((sgt) a.c().M(4129)).E("Checksum is %s, expecting %s", smbVar2.g(bArrDigest), "2F01B88911B7897DD738B9CF658A28A6");
                    }
                } catch (Exception e3) {
                    ((sgt) a.b().M(4130)).v("Failed to compute MD5 hash: %s", e3);
                    c(3);
                }
                pbn pbnVar3 = this.e;
                pbnVar3.g();
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr3.length);
                byteBufferAllocateDirect.put(bArr3);
                long jA = BufferUtils.a(byteBufferAllocateDirect);
                long jCapacity = byteBufferAllocateDirect.capacity();
                pbnVar3.f("PortraitSegmenterManager#nativeInitialization");
                rwc rwcVarB = ((ixr) this.k).b();
                String absolutePath = rwcVarB.h() ? new File((File) rwcVarB.c(), "tflite_vakunov_multi-subject_2018-06-09.fb.enc.cache").getAbsolutePath() : "";
                boolean z = this.g;
                boolean z2 = this.h;
                boolean z3 = this.i;
                boolean zInitSegmenter = tgkVar.initSegmenter(jA, jCapacity, "tflite_vakunov_multi-subject_2018-06-09.fb.enc", absolutePath, z, z2, z3, this.m, this.j);
                if (zInitSegmenter && !z && this.m && !(zInitSegmenter = tgkVar.dummyImageProducesReasonableMask())) {
                    ((sgt) a.b().M(4128)).s("OpenCL segmenter failed to produce a reasonable mask, falling back to OpenGL.");
                    tgkVar.release();
                    c(5);
                    byteBufferAllocateDirect.clear();
                    byteBufferAllocateDirect.put(bArr3);
                    this.m = false;
                    zInitSegmenter = tgkVar.initSegmenter(jA, jCapacity, "tflite_vakunov_multi-subject_2018-06-09.fb.enc", absolutePath, false, z2, z3, false, false);
                }
                pbnVar3.g();
                if (!zInitSegmenter) {
                    c(4);
                }
                this.d = zInitSegmenter;
            }
        }
    }
}
