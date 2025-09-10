package defpackage;

import android.content.Context;
import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import com.google.android.build.data.JKx.wzgaYJqO;
import com.google.common.io.ByteStreams;
import com.google.googlex.gcam.creativecamera.portraitmode.PortraitRelightingProcessorInterface;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lgd implements lgo, jhh, jgm, jgl {
    public static final sgv a = sgv.g("lgd");
    private static final sbv i = sbv.l(Arrays.asList(new AbstractMap.SimpleImmutableEntry("face_light_256_256-P21-custom_op.tflite", "A891DF2BC3F5F99941681615A5B730CA"), new AbstractMap.SimpleImmutableEntry("facemesh-full-P21-custom_op.tflite", "3F960EFFF9FC2CDF78E67B6CCC3EBA29"), new AbstractMap.SimpleImmutableEntry("ffv6_holo040820_normals_net_mixed_fp16_256_256-P21-custom_op.tflite", "C9DDF79CBA8F9E7801CF492760C8BB40"), new AbstractMap.SimpleImmutableEntry("ffv6_holo040820_relighting_net_mixed_fp16_256_256-P21-custom_op.tflite", "411964205B9443CC789BFB38114EBA8E"), new AbstractMap.SimpleImmutableEntry("face_light_256_256-P22-custom_op.tflite", "6E94AF81E6B3A3559AEA3264C08B44C8"), new AbstractMap.SimpleImmutableEntry("facemesh-full-P22-custom_op.tflite", wzgaYJqO.tguGKsExekB), new AbstractMap.SimpleImmutableEntry("ffv6_holo040820_normals_net_mixed_fp16_256_256-P22-custom_op.tflite", "AD6B39D065BAA50CBCB7C653475026C9"), new AbstractMap.SimpleImmutableEntry("ffv6_holo040820_relighting_net_mixed_fp16_256_256-P22-custom_op.tflite", "F099417EC82DF3EB41A7587090831E85"), new AbstractMap.SimpleImmutableEntry("face_light_256_256-P23-custom_op.tflite", "F396FA80313C1E513F60AD010E1F5532"), new AbstractMap.SimpleImmutableEntry("facemesh-full-P23-custom_op.tflite", "927636C05786D1C56F64F2350CD63849"), new AbstractMap.SimpleImmutableEntry("ffv6_holo040820_normals_net_mixed_fp16_256_256-P23-custom_op.tflite", "A67E567502B263D1E6918F323601CB1C"), new AbstractMap.SimpleImmutableEntry("ffv6_holo040820_relighting_net_mixed_fp16_256_256-P23-custom_op.tflite", "71047F4A027EBFAFF158DEC586038D04")));
    public final Context b;
    public final boolean c;
    public final uem d;
    public final hbj h;
    private final pbn j;
    private final Executor k;
    public boolean f = false;
    public final ReentrantLock g = new ReentrantLock();
    public final PortraitRelightingProcessorInterface e = new PortraitRelightingProcessorInterface();

    public lgd(pbn pbnVar, Context context, hbj hbjVar, uem uemVar, Executor executor, boolean z) {
        this.j = pbnVar;
        this.b = context;
        this.h = hbjVar;
        this.c = z;
        this.d = uemVar;
        this.k = executor;
    }

    @Override // defpackage.lgo
    public final long a() {
        if (!this.g.tryLock()) {
            return 0L;
        }
        try {
            return this.e.getPortraitRelightingProcessorHandle();
        } finally {
            this.g.unlock();
        }
    }

    @Override // defpackage.jgl
    public final void b() {
        this.k.execute(new lgc(this, 0));
    }

    @Override // defpackage.jgm
    public final void c() {
        this.k.execute(new lgc(this, 2));
    }

    @Override // defpackage.lgo
    public final void d() {
        this.k.execute(new lac(this, 3));
    }

    @Override // defpackage.lgo
    public final boolean e(boolean z) {
        return (z ? this.h.p(hak.D) : this.h.p(ham.c)) && a() != 0;
    }

    public final byte[] f(Context context, String str, String str2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        this.j.f("FireflyMgr#loadModelAsset");
        byte[] bArr = new byte[0];
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            int iAvailable = inputStreamOpen.available();
            byte[] bArr2 = new byte[iAvailable];
            int i2 = ByteStreams.read(inputStreamOpen, bArr2, 0, iAvailable);
            if (inputStreamOpen.available() != 0) {
                ((sgt) a.b().M(4126)).s("There is more data. This is problematic");
            }
            inputStreamOpen.close();
            if (i2 != iAvailable) {
                ((sgt) a.b().M(4125)).s("Didn't finish reading the asset.");
            }
            bArr = bArr2;
        } catch (IOException e) {
            ((sgt) a.b().M(4123)).v("Unable to load the asset: %s", e);
        }
        this.j.f("FireflyMgr#decrypt");
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
            ((sgt) a.b().M(4115)).v("Unable to decrypt bytes: %s", e2);
        }
        pbn pbnVar = this.j;
        pbnVar.g();
        pbnVar.f("FireflyMgr#md5");
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(bArrDoFinal);
            smb smbVar2 = smb.g;
            if (!MessageDigest.isEqual(bArrDigest, smbVar2.h(str2))) {
                ((sgt) a.c().M(4113)).E("Checksum is %s, expecting %s", smbVar2.g(bArrDigest), str2);
            }
        } catch (Exception e3) {
            ((sgt) a.b().M(4114)).v("Failed to compute MD5 hash: %s", e3);
        }
        pbn pbnVar2 = this.j;
        pbnVar2.g();
        pbnVar2.g();
        return bArrDoFinal;
    }

    public final byte[] g(Context context, String str, String str2) {
        String str3 = String.format(CGlJpiVWrCQOq.KcyN, str, str2);
        return f(context, str2 + "/" + str3 + ".enc", (String) i.getOrDefault(str3, ""));
    }
}
