package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.PointF;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import com.google.android.gms.wearable.aXYS.zflNUOOzDfM;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.ar.core.R;
import com.google.common.io.ByteStreams;
import j$.time.Instant;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.AbstractMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class prh {
    public static volatile prh a;

    public static boolean A(String str) {
        return str.startsWith("video/");
    }

    public static long B(InputStream inputStream, pos posVar) {
        return D(inputStream, null, posVar);
    }

    public static long C(byte[] bArr, pos posVar) {
        return E(bArr, null, posVar);
    }

    public static long D(InputStream inputStream, ExifInterface exifInterface, pos posVar) throws IOException {
        long jCopy;
        FileOutputStream fileOutputStreamE = posVar.e();
        try {
            if (exifInterface != null) {
                sml smlVar = new sml(fileOutputStreamE);
                try {
                    OutputStream outputStreamM = exifInterface.m(smlVar);
                    try {
                        ByteStreams.copy(inputStream, outputStreamM);
                        outputStreamM.close();
                        smlVar.flush();
                        jCopy = smlVar.a;
                        smlVar.close();
                    } finally {
                    }
                } finally {
                }
            } else {
                jCopy = ByteStreams.copy(inputStream, fileOutputStreamE);
            }
            fileOutputStreamE.flush();
            fileOutputStreamE.close();
            return jCopy;
        } catch (Throwable th) {
            try {
                fileOutputStreamE.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long E(byte[] bArr, ExifInterface exifInterface, pos posVar) {
        return D(new ByteArrayInputStream(bArr), exifInterface, posVar);
    }

    public static long F(InputStream inputStream, ExifInterface exifInterface, pos posVar) {
        return exifInterface == null ? B(inputStream, posVar) : G(ByteStreams.toByteArray(inputStream), exifInterface, posVar);
    }

    public static long G(byte[] bArr, ExifInterface exifInterface, pos posVar) throws IOException {
        if (exifInterface == null) {
            return C(bArr, posVar);
        }
        FileOutputStream fileOutputStreamE = posVar.e();
        try {
            OutputStream outputStreamM = exifInterface.m(fileOutputStreamE);
            try {
                rwd rwdVarD = pqw.d(bArr, (edw) pqw.c(exifInterface.bA).f());
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                pqw.o(bArr, byteArrayOutputStream, (edw) rwdVarD.a, (edw) rwdVarD.b);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                outputStreamM.write(byteArray);
                long length = byteArray.length;
                outputStreamM.close();
                fileOutputStreamE.close();
                return length;
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileOutputStreamE.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static PointF H(PointF pointF, int i) {
        boolean z = false;
        if (pointF.x >= 0.0f && pointF.x <= 1.0f && pointF.y >= 0.0f && pointF.y <= 1.0f) {
            z = true;
        }
        rnt.B(z, "Input coordinates should be in [0, 1].");
        int i2 = (360 - i) % 360;
        if (i2 == 0) {
            return pointF;
        }
        if (i2 == 90) {
            return new PointF(pointF.y, 1.0f - pointF.x);
        }
        if (i2 == 180) {
            return new PointF(1.0f - pointF.x, 1.0f - pointF.y);
        }
        if (i2 == 270) {
            return new PointF(1.0f - pointF.y, pointF.x);
        }
        throw new IllegalArgumentException("Unsupported Sensor Orientation");
    }

    public static String I(pnf pnfVar) {
        if (pnfVar == null) {
            return "-";
        }
        if (pnfVar instanceof pnd) {
            return Long.toString(((pnd) pnfVar).a);
        }
        if (!(pnfVar instanceof pne)) {
            return "-";
        }
        pne pneVar = (pne) pnfVar;
        return String.format(Locale.ROOT, "n: %6.6s, min: %12.12s, max: %12.12s, mean: %12.12s, last: %12.12s, n25: %6.6s, n50: %6.6s, n75: %6.6s, n100: %6.6s", Long.valueOf((long) pneVar.a), U(pneVar.b), U(pneVar.c), U(pneVar.d), U(pneVar.e), Long.valueOf((long) pneVar.f[0]), Long.valueOf((long) pneVar.f[1]), Long.valueOf((long) pneVar.f[2]), Long.valueOf((long) pneVar.f[3]));
    }

    public static /* synthetic */ int J(long j, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a.bv(i, "0 > "));
        }
        return (int) Math.min(i, Math.max(j, 0L));
    }

    public static /* synthetic */ Map.Entry K(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public static peq L(pjr pjrVar, pas pasVar) {
        pep pepVarA = peq.a();
        pepVarA.r(pet.SURFACE_VIEW);
        pepVarA.b(pjrVar);
        pepVarA.n(pasVar);
        return pepVarA.a();
    }

    public static final boolean M(short s) {
        return ((s & (-16)) != -64 || s == -60 || s == -56 || s == -52) ? false : true;
    }

    public static String N(long j) {
        return V(j % 1000, 3);
    }

    public static String O(long j) {
        return V(j, 2);
    }

    public static /* synthetic */ String P(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "PAUSED" : "CLOSED" : "STARTED" : "READY";
    }

    public static /* synthetic */ String Q(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "CLOSED" : "PAUSED" : "STARTED" : zflNUOOzDfM.bCu;
    }

    public static /* synthetic */ String R(int i) {
        switch (i) {
            case 1:
                return "READY";
            case 2:
                return "STARTED";
            case 3:
                return "PAUSED";
            case 4:
                return "STOPPING";
            case 5:
                return "STOPPED";
            case 6:
                return "CLOSED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String S(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "CLOSED" : "STOPPED" : "STARTED" : "READY";
    }

    private static String V(long j, int i) {
        return rnt.A(Long.toString(j), i);
    }

    public static boolean a(Context context) {
        return "com.google.android.gms".equals(context.getPackageName());
    }

    public static int b(int i) {
        switch (i) {
            case -1:
                return 1;
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
            default:
                return 0;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 16;
            case 15:
                return 17;
            case 16:
                return 18;
        }
    }

    public static void c() {
        d(Looper.myLooper() == Looper.getMainLooper(), "This should be running on the main thread.");
    }

    public static void d(boolean z, String str) {
        if (z) {
            return;
        }
        T(new IllegalStateException(str));
    }

    public static void e(Object obj) {
        if (obj == null) {
            T(new NullPointerException());
        }
    }

    public static /* synthetic */ String f(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "NETWORK_STATE_ANY" : "NETWORK_STATE_UNMETERED" : "NETWORK_STATE_CONNECTED";
    }

    public static /* synthetic */ pty g() {
        tpc tpcVarM = pty.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        pty ptyVar = (pty) tphVar;
        ptyVar.b |= 1;
        ptyVar.c = true;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        pty ptyVar2 = (pty) tphVar2;
        ptyVar2.b |= 2;
        ptyVar2.d = true;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        pty ptyVar3 = (pty) tpcVarM.b;
        ptyVar3.b |= 4;
        ptyVar3.e = false;
        return (pty) tpcVarM.l();
    }

    public static final FontFamily.Builder h(Context context, pth pthVar, ptm ptmVar, CancellationSignal cancellationSignal) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        context.getClass();
        pthVar.getClass();
        ptmVar.getClass();
        rbt rbtVarA = a.ao(context.getPackageName(), "com.google.android.gms") ? rbt.b : rbt.a("com.google.android.gms");
        Uri uri = pthVar.a;
        int i = rbu.a;
        ContentResolver contentResolver = context.getContentResolver();
        String scheme = uri.getScheme();
        if ("android.resource".equals(scheme)) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r", cancellationSignal);
        } else if ("content".equals(scheme)) {
            if (!rbu.f(context, uri, rbu.a("r"), rbtVarA)) {
                throw new FileNotFoundException("Can't open content uri.");
            }
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r", cancellationSignal);
            rbu.g(assetFileDescriptorOpenAssetFileDescriptor);
        } else {
            if (!"file".equals(scheme)) {
                throw new FileNotFoundException("Unsupported scheme");
            }
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r", cancellationSignal);
            try {
                rbu.e(context, assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor(), uri, rbtVarA);
            } catch (FileNotFoundException e) {
                rbu.d(assetFileDescriptorOpenAssetFileDescriptor, e);
                throw e;
            } catch (IOException e2) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e2);
                rbu.d(assetFileDescriptorOpenAssetFileDescriptor, fileNotFoundException);
                throw fileNotFoundException;
            }
        }
        ParcelFileDescriptor parcelFileDescriptor = assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor();
        if (parcelFileDescriptor == null) {
            return null;
        }
        try {
            Font fontBuild = new Font.Builder(parcelFileDescriptor).setWeight(pthVar.c).setSlant(pthVar.d ? 1 : 0).setTtcIndex(pthVar.b).setFontVariationSettings(ptl.a(ptmVar.b, context)).build();
            fontBuild.getClass();
            FontFamily.Builder builder = new FontFamily.Builder(fontBuild);
            ujk.e(parcelFileDescriptor, null);
            return builder;
        } finally {
        }
    }

    public static final void i(avp avpVar, awh awhVar, awo awoVar, awu awuVar, uiu uiuVar, ayc aycVar, int i) {
        int i2;
        awh psnVar;
        awo awoVar2;
        awu awuVarAq;
        awu awuVar2;
        awo awoVar3;
        awh awhVar2;
        uiuVar.getClass();
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(295511914);
        if (i3 == 0) {
            i2 = (true != aycVarC.B(avpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= true != aycVarC.D(uiuVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && aycVarC.G()) {
            aycVarC.r();
            awhVar2 = awhVar;
            awoVar3 = awoVar;
            awuVar2 = awuVar;
        } else {
            aycVarC.s();
            if ((i & 1) == 0 || aycVarC.E()) {
                psnVar = new psn();
                awoVar2 = psq.a;
                cdo cdoVar = ptc.a;
                cdo cdoVar2 = ptc.d;
                cdo cdoVar3 = ptc.e;
                cdo cdoVar4 = ptc.f;
                cdo cdoVar5 = ptc.g;
                cdo cdoVar6 = ptc.h;
                cdo cdoVar7 = ptc.i;
                cdo cdoVar8 = ptc.m;
                cdo cdoVar9 = ptc.n;
                cdo cdoVar10 = ptc.o;
                cdo cdoVar11 = ptc.a;
                cdo cdoVar12 = ptc.b;
                cdo cdoVar13 = ptc.c;
                cdo cdoVar14 = ptc.j;
                cdo cdoVar15 = ptc.k;
                cdo cdoVar16 = ptc.l;
                cdo cdoVar17 = ptb.a;
                awuVarAq = qpt.aq(cdoVar2, cdoVar3, cdoVar4, cdoVar5, cdoVar6, cdoVar7, cdoVar8, cdoVar9, cdoVar10, cdoVar11, cdoVar12, cdoVar13, cdoVar14, cdoVar15, cdoVar16, ptb.d, ptb.e, ptb.f, ptb.g, ptb.h, ptb.i, ptb.m, ptb.n, ptb.o, ptb.a, ptb.b, ptb.c, ptb.j, ptb.k, ptb.l);
            } else {
                aycVarC.r();
                psnVar = awhVar;
                awoVar2 = awoVar;
                awuVarAq = awuVar;
            }
            aycVarC.l();
            int i4 = (i2 & 14) | 24576;
            awh awhVar3 = psnVar;
            awo awoVar4 = awoVar2;
            awu awuVar3 = awuVarAq;
            awd.a(avpVar, awhVar3, awoVar4, awuVar3, bdq.k(-1166625323, new psl(qpt.as(avpVar, aycVarC), uiuVar), aycVarC), aycVarC, i4);
            awuVar2 = awuVar3;
            awoVar3 = awoVar4;
            awhVar2 = awhVar3;
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new awb(avpVar, awhVar2, awoVar3, awuVar2, uiuVar, i, 5);
        }
    }

    public static pzj j(Context context, pwt pwtVar) {
        try {
            return pzj.a(context.getSharedPreferences("gms_icing_mdd_migrations", 0).getInt("mdd_file_key_version", pzj.NEW_FILE_KEY.d));
        } catch (IllegalArgumentException unused) {
            pwtVar.a();
            context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().clear().commit();
            return pzj.USE_CHECKSUM_ONLY;
        }
    }

    public static boolean k(Context context) {
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).getBoolean("migrated_to_new_file_key", false);
    }

    public static boolean l(Context context, pzj pzjVar) {
        pzjVar.name();
        int i = qbu.a;
        return context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putInt("mdd_file_key_version", pzjVar.d).commit();
    }

    public static void m(Context context) {
        int i = qbu.a;
        context.getSharedPreferences("gms_icing_mdd_migrations", 0).edit().putBoolean("migrated_to_new_file_key", true).commit();
    }

    public static int n(Throwable th) {
        if (th instanceof ExecutionException) {
            th = th.getCause();
        }
        if (th instanceof CancellationException) {
            return 5;
        }
        if (th instanceof InterruptedException) {
            return 6;
        }
        if (th instanceof IOException) {
            return 7;
        }
        if (th instanceof IllegalStateException) {
            return 8;
        }
        if (th instanceof IllegalArgumentException) {
            return 9;
        }
        if (th instanceof UnsupportedOperationException) {
            return 10;
        }
        return th instanceof pul ? 11 : 4;
    }

    public static /* synthetic */ String o(int i) {
        return i != 1 ? i != 2 ? "DOWNLOADED_GROUP" : "IN_PROGRESS_FUTURE" : "PENDING_GROUP";
    }

    public static boolean p(tvy tvyVar) {
        try {
            rdy.a(tvyVar);
            return true;
        } catch (IllegalArgumentException e) {
            qbu.f(e, "Invalid transform specification");
            return false;
        }
    }

    public static final long q() {
        return Instant.now().toEpochMilli();
    }

    public static clm r(Context context) {
        clm clmVarS = s(context);
        clmVarS.f(context.getResources().getString(R.string.mdd_foreground_service_notification_title));
        clmVarS.i(android.R.drawable.stat_notify_sync_noanim);
        return clmVarS;
    }

    public static clm s(Context context) {
        clm clmVar = new clm(context, "download-notification-channel-id");
        clmVar.n = "service";
        clmVar.d(8, true);
        return clmVar;
    }

    public static String t(Context context) {
        return context.getResources().getString(R.string.mdd_notification_download_failed);
    }

    public static void u(Context context, Class cls, String str) {
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtra("key", str);
        context.startForegroundService(intent);
    }

    public static void v(Context context, Class cls, String str) {
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtra("stop-service", true);
        intent.putExtra("key", str);
        context.startForegroundService(intent);
    }

    public static String w(Account account) {
        return account.type + ":" + account.name;
    }

    public static pwv x(pty ptyVar) {
        tak takVar = new tak();
        takVar.g(true);
        takVar.f(true);
        takVar.e(false);
        if ((1 & ptyVar.b) != 0) {
            takVar.g(ptyVar.c);
        }
        if ((ptyVar.b & 2) != 0) {
            takVar.f(ptyVar.d);
        }
        if ((ptyVar.b & 4) != 0) {
            takVar.e(ptyVar.e);
        }
        if (takVar.d == 7) {
            return new pwv(takVar.c, takVar.b, takVar.a);
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String y(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case 99613: goto L4e;
                case 102340: goto L44;
                case 105441: goto L3a;
                case 108273: goto L30;
                case 111145: goto L26;
                case 115312: goto L1c;
                case 1621908: goto L12;
                case 3268712: goto L8;
                default: goto L7;
            }
        L7:
            goto L58
        L8:
            java.lang.String r0 = "jpeg"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L58
            r0 = 1
            goto L59
        L12:
            java.lang.String r0 = "3gpp"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L58
            r0 = 6
            goto L59
        L1c:
            java.lang.String r0 = "txt"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L58
            r0 = 7
            goto L59
        L26:
            java.lang.String r0 = "png"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L58
            r0 = 3
            goto L59
        L30:
            java.lang.String r0 = "mp4"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L58
            r0 = 5
            goto L59
        L3a:
            java.lang.String r0 = "jpg"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L58
            r0 = 0
            goto L59
        L44:
            java.lang.String r0 = "gif"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L58
            r0 = 2
            goto L59
        L4e:
            java.lang.String r0 = "dng"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L58
            r0 = 4
            goto L59
        L58:
            r0 = -1
        L59:
            switch(r0) {
                case 0: goto L77;
                case 1: goto L77;
                case 2: goto L74;
                case 3: goto L71;
                case 4: goto L6e;
                case 5: goto L6b;
                case 6: goto L68;
                case 7: goto L65;
                default: goto L5c;
            }
        L5c:
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r1 = r0.getMimeTypeFromExtension(r1)
            return r1
        L65:
            java.lang.String r1 = "text/plain"
            return r1
        L68:
            java.lang.String r1 = "video/3gpp"
            return r1
        L6b:
            java.lang.String r1 = "video/mp4"
            return r1
        L6e:
            java.lang.String r1 = "image/x-adobe-dng"
            return r1
        L71:
            java.lang.String r1 = "image/png"
            return r1
        L74:
            java.lang.String r1 = "image/gif"
            return r1
        L77:
            java.lang.String r1 = "image/jpeg"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prh.y(java.lang.String):java.lang.String");
    }

    public static boolean z(String str) {
        return str.startsWith("image/");
    }

    private static void T(RuntimeException runtimeException) {
        Log.e("Preconditions", yoGAhrpjU.tNjhojwqaqsgpEV, runtimeException);
    }

    private static String U(double d) {
        if (d <= 9.999999999E9d && d >= -9.99999999E8d) {
            return String.format(Locale.ROOT, "%.4f", Double.valueOf(d));
        }
        return String.format(Locale.ROOT, zflNUOOzDfM.UXc, Double.valueOf(d));
    }
}
