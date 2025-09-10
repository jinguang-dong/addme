package defpackage;

import android.content.ContentProvider;
import android.content.Context;
import android.content.UriMatcher;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.wear.ambient.AmbientMode;
import com.google.ar.core.R;
import com.google.googlex.gcam.Gcam;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ree {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public ree(ContentProvider contentProvider, Context context, hkk hkkVar, ggg gggVar, hrb hrbVar, UriMatcher uriMatcher, pbn pbnVar) {
        this.d = contentProvider;
        this.g = context;
        this.b = hkkVar;
        this.e = gggVar;
        this.a = hrbVar;
        this.c = uriMatcher;
        this.f = pbnVar;
    }

    public static ssc f(nkw nkwVar, boolean z) {
        gho ghoVar = gho.OFF;
        oyu oyuVar = oyu.VIDEO_BUFFER_DELAY;
        nkw nkwVar2 = nkw.UNINITIALIZED;
        int iOrdinal = nkwVar.ordinal();
        if (iOrdinal == 2) {
            return z ? ssc.VIDEO_STILL : ssc.VIDEO_CAPTURE;
        }
        if (iOrdinal == 5) {
            return z ? ssc.SLOW_MOTION_STILL : ssc.SLOW_MOTION;
        }
        if (iOrdinal == 8) {
            return ssc.VIDEO_CAPTURE_INTENT;
        }
        if (iOrdinal == 11) {
            return z ? ssc.TIMELAPSE_STILL : ssc.TIMELAPSE;
        }
        if (iOrdinal == 19) {
            return z ? ssc.VEGA_STILL : ssc.VEGA;
        }
        if (iOrdinal == 13) {
            return z ? ssc.VIDEO_PORTRAIT_STILL : ssc.VIDEO_PORTRAIT;
        }
        if (iOrdinal == 14) {
            return z ? ssc.CINEMATIC_PAN_STILL : ssc.CINEMATIC_PAN;
        }
        throw new IllegalArgumentException("Not a valid video mode: ".concat(String.valueOf(String.valueOf(nkwVar))));
    }

    public static int i(int i) {
        gho ghoVar = gho.OFF;
        oyu oyuVar = oyu.VIDEO_BUFFER_DELAY;
        nkw nkwVar = nkw.UNINITIALIZED;
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
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
                return 9;
            default:
                return 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, sxi] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final synchronized ren a(rec recVar) {
        ren renVar;
        ?? r0 = this.a;
        Uri uri = recVar.a;
        renVar = (ren) r0.get(uri);
        boolean z = true;
        if (renVar == null) {
            rnt.F(uri.isHierarchical(), "Uri must be hierarchical: %s", uri);
            String strU = rnt.U(uri.getLastPathSegment());
            int iLastIndexOf = strU.lastIndexOf(46);
            rnt.F((iLastIndexOf == -1 ? "" : strU.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uri);
            rnt.B(recVar.b != null, "Proto schema cannot be null");
            rnt.B(recVar.c != null, "Handler cannot be null");
            reo reoVar = (reo) this.f.get("singleproc");
            if (reoVar == 0) {
                z = false;
            }
            rnt.F(z, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
            String strU2 = rnt.U(uri.getLastPathSegment());
            int iLastIndexOf2 = strU2.lastIndexOf(46);
            if (iLastIndexOf2 != -1) {
                strU2 = strU2.substring(0, iLastIndexOf2);
            }
            syu syuVarJ = swz.j(ske.M(uri), this.e, sxo.a);
            ?? r5 = this.c;
            rel relVarB = reoVar.b(recVar, strU2, r5, (lat) this.d);
            reoVar.a();
            ren renVar2 = new ren(relVarB, syuVarJ);
            sbp sbpVar = recVar.d;
            if (!sbpVar.isEmpty()) {
                renVar2.c(new rea(sbpVar, r5));
            }
            r0.put(uri, renVar2);
            this.b.put(uri, recVar);
            renVar = renVar2;
        } else {
            rec recVar2 = (rec) this.b.get(uri);
            if (!recVar.equals(recVar2)) {
                tqr tqrVar = recVar.b;
                String strZ = rnt.z("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", tqrVar.getClass().getSimpleName(), uri);
                rnt.F(uri.equals(recVar2.a), strZ, "uri");
                rnt.F(tqrVar.equals(recVar2.b), strZ, "schema");
                rnt.F(recVar.c.equals(recVar2.c), strZ, "handler");
                rnt.F(ujp.aH(recVar.d, recVar2.d), strZ, "migrations");
                rnt.F(recVar.f.equals(recVar2.f), strZ, "variantConfig");
                rnt.F(recVar.e == recVar2.e, strZ, "useGeneratedExtensionRegistry");
                rnt.F(true, strZ, "enableTracing");
                throw new IllegalArgumentException(rnt.z(strZ, "unknown"));
            }
        }
        return renVar;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, peo] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, pdv] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, klf] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kvy] */
    public final kmz b() {
        pem pemVarA = pen.a();
        pemVarA.b(3);
        pemVarA.c(4);
        pemVarA.e(1);
        pemVarA.d(true);
        pen penVarA = pemVarA.a();
        Object obj = this.d;
        ?? r9 = this.e;
        kuw kuwVar = (kuw) obj;
        return new kmv(new kwz((pfu) this.g, this.c, this.f, this.a, 1, r9, kuwVar, penVarA, this.b), 3, true);
    }

    public final void c() {
        ((AtomicBoolean) this.g).set(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, paq] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, pjo] */
    public final void d() {
        this.a.close();
        ((AtomicBoolean) this.b).set(false);
        if (mwq.z()) {
            if (((hbj) this.d).p(hae.j)) {
                ?? r0 = this.f;
                if (r0.l().equals(pka.BACK)) {
                    Object obj = this.e;
                    HashSet hashSet = new HashSet();
                    hashSet.add(new pej(nvl.d, true));
                    hashSet.add(new pej(nvl.b, Integer.valueOf(((mwq) obj).y(r0))));
                    ((pfu) this.c).n(hashSet);
                }
            }
        }
    }

    public final ParcelFileDescriptor e(Uri uri, int i) throws Throwable {
        Bitmap bitmap;
        ParcelFileDescriptor parcelFileDescriptor;
        int i2 = Integer.parseInt(uri.getPathSegments().get(1));
        int dimensionPixelSize = ((Context) this.g).getResources().getDimensionPixelSize(i);
        BufferedOutputStream bufferedOutputStream = null;
        Drawable drawable = ((Context) ((ggg) this.e).a).getResources().getDrawable(i2, null);
        if (drawable == null) {
            throw new FileNotFoundException(a.bv(i2, "resource is not found for "));
        }
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            bitmap = bitmapCreateBitmap;
        }
        bitmap.getClass();
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, dimensionPixelSize, dimensionPixelSize, false);
        if (i == R.dimen.photos_oemapi_dialog_icon_size) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateScaledBitmap.getWidth(), bitmapCreateScaledBitmap.getHeight(), bitmapCreateScaledBitmap.getConfig());
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            Paint paint = new Paint();
            paint.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
            canvas2.drawBitmap(bitmapCreateScaledBitmap, 0.0f, 0.0f, paint);
            bitmapCreateScaledBitmap = bitmapCreateBitmap2;
        }
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        try {
            ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
            ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptorArrCreatePipe[0];
            parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[1];
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(parcelFileDescriptor.getFileDescriptor()));
                try {
                    bitmapCreateScaledBitmap.compress(compressFormat, 100, bufferedOutputStream2);
                    bufferedOutputStream2.close();
                    try {
                        bufferedOutputStream2.close();
                    } catch (IOException unused) {
                    }
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return parcelFileDescriptor2;
                } catch (IOException e) {
                    e = e;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException e2) {
                            e = e2;
                        }
                    }
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException e3) {
                            e = e3;
                        }
                    }
                    String message = e.getMessage();
                    if (message != null) {
                        throw new FileNotFoundException(message);
                    }
                    throw new FileNotFoundException();
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (parcelFileDescriptor == null) {
                        throw th;
                    }
                    try {
                        parcelFileDescriptor.close();
                        throw th;
                    } catch (IOException unused4) {
                        throw th;
                    }
                }
            } catch (IOException e4) {
                e = e4;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e5) {
            e = e5;
            parcelFileDescriptor = null;
        } catch (Throwable th3) {
            th = th3;
            parcelFileDescriptor = null;
        }
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, mhq] */
    /* JADX WARN: Type inference failed for: r2v2, types: [fyw, java.lang.Object] */
    public final void g(Throwable th, pka pkaVar) {
        int i = th instanceof TimeoutException ? 3 : th instanceof IllegalStateException ? 4 : th instanceof IOException ? 5 : 1;
        gau gauVarA = ((gav) this.g).a();
        tpc tpcVarM = suh.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        suh suhVar = (suh) tpcVarM.b;
        suhVar.f = i - 1;
        suhVar.b |= 8;
        ((mdy) this.e).H(f(this.d.a(), true), pkaVar, null, ((Float) gauVarA.b.dL()).floatValue(), ((Boolean) ((ovx) gauVarA.f).d).booleanValue(), -1.0f, (suh) tpcVarM.l(), this.a.a().j, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, mhq] */
    /* JADX WARN: Type inference failed for: r4v8, types: [fyw, java.lang.Object] */
    public final void h(gbv gbvVar, pka pkaVar) {
        gau gauVarA = ((gav) this.g).a();
        tpc tpcVarM = suh.a.m();
        pas pasVar = gbvVar.e;
        int i = pasVar.b;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        suh suhVar = (suh) tphVar;
        suhVar.b |= 1;
        suhVar.c = i;
        int i2 = pasVar.a;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        suh suhVar2 = (suh) tphVar2;
        suhVar2.b |= 2;
        suhVar2.d = i2;
        int i3 = gbvVar.g;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        suh suhVar3 = (suh) tphVar3;
        suhVar3.b |= 4;
        suhVar3.e = i3;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        tph tphVar4 = tpcVarM.b;
        suh suhVar4 = (suh) tphVar4;
        suhVar4.f = 1;
        suhVar4.b |= 8;
        int i4 = (int) gbvVar.f;
        if (!tphVar4.C()) {
            tpcVarM.o();
        }
        suh suhVar5 = (suh) tpcVarM.b;
        suhVar5.b |= 16;
        suhVar5.g = i4;
        suh suhVar6 = (suh) tpcVarM.l();
        Object obj = this.e;
        ssc sscVarF = f(this.d.a(), true);
        gbvVar.b.getName();
        ((mdy) obj).H(sscVarF, pkaVar, gbvVar.a, ((Float) gauVarA.b.dL()).floatValue(), ((Boolean) ((ovx) gauVarA.f).d).booleanValue(), r5 / 1000, suhVar6, this.a.a().j, gbvVar.d.c == ltg.MARS_STORE);
    }

    public final synchronized void j(eso esoVar, eqi eqiVar) {
        ((jod) this.b).z(eqiVar, esoVar);
    }

    public final synchronized void k(eso esoVar, eqi eqiVar, esq esqVar) {
        if (esqVar != null) {
            if (esqVar.a) {
                ((ers) this.d).b(eqiVar, esqVar);
            }
            ((jod) this.b).z(eqiVar, esoVar);
        } else {
            ((jod) this.b).z(eqiVar, esoVar);
        }
    }

    public ree(mdy mdyVar, gtm gtmVar, fyw fywVar, mhq mhqVar, gav gavVar, mfb mfbVar, gox goxVar) {
        this.e = mdyVar;
        this.c = gtmVar;
        this.d = fywVar;
        this.a = mhqVar;
        this.g = gavVar;
        this.b = mfbVar;
        this.f = goxVar;
    }

    public ree(pfu pfuVar, pdv pdvVar, peo peoVar, klf klfVar, kuw kuwVar, pbn pbnVar, kvy kvyVar) {
        this.g = pfuVar;
        this.f = pdvVar;
        this.c = peoVar;
        this.a = klfVar;
        this.d = kuwVar;
        this.b = pbnVar;
        this.e = kvyVar;
    }

    public ree(rwc rwcVar, paq paqVar, pfu pfuVar, mwq mwqVar, pjo pjoVar, AtomicBoolean atomicBoolean, hbj hbjVar) {
        this.a = paqVar;
        this.g = rwcVar;
        this.c = pfuVar;
        this.e = mwqVar;
        this.f = pjoVar;
        this.b = atomicBoolean;
        this.d = hbjVar;
    }

    public ree(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7) {
        this.c = tzxVar;
        this.d = tzxVar2;
        this.g = tzxVar3;
        this.b = tzxVar4;
        this.f = tzxVar5;
        this.a = tzxVar6;
        this.e = tzxVar7;
    }

    public ree(Gcam gcam, hbj hbjVar, pjo pjoVar, pjp pjpVar, hzs hzsVar, jid jidVar, kgk kgkVar, kqp kqpVar) {
        this.e = hzsVar;
        this.a = jidVar;
        this.c = kgkVar;
        this.b = new tgq(pjoVar, pjpVar);
        this.f = kqpVar;
        this.g = gcam;
        this.d = hbjVar;
    }

    public ree(etx etxVar, ejt ejtVar, eue eueVar, eue eueVar2, eue eueVar3) throws Throwable {
        this.c = etxVar;
        esj esjVar = new esj(ejtVar);
        this.a = esjVar;
        ers ersVar = new ers();
        this.d = ersVar;
        synchronized (this) {
            try {
                synchronized (ersVar) {
                    try {
                        try {
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                }
                this.b = new jod((byte[]) null, (byte[]) null, (byte[]) null);
                this.e = new gko(eueVar, eueVar2, eueVar3, this, this);
                this.g = new ode(esjVar);
                this.f = new nyt();
                ((etw) etxVar).a = this;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public ree(Executor executor, lat latVar, rer rerVar, Map map, ret retVar) {
        Object qciVar;
        this.a = new HashMap();
        this.b = new HashMap();
        executor.getClass();
        this.c = executor;
        latVar.getClass();
        this.d = latVar;
        this.g = rerVar;
        this.f = map;
        a.I(!map.isEmpty());
        if (retVar != null) {
            int i = slm.a;
            qciVar = new red(new qas(retVar, slt.a), 0);
        } else {
            qciVar = new qci(4);
        }
        this.e = qciVar;
    }

    public ree(Context context, imi imiVar, mky mkyVar, ndj ndjVar, kqy kqyVar, kcs kcsVar, AmbientMode.AmbientController ambientController) {
        this.g = new AtomicBoolean(false);
        this.a = context;
        this.d = imiVar;
        this.f = mkyVar;
        this.c = ndjVar;
        this.b = kqyVar;
        this.e = kcsVar;
        lzi lziVarA = lzj.a();
        lziVarA.a = "Nightlapse";
        lziVarA.c(new sfm(nkw.TIME_LAPSE));
        lziVarA.b(scn.H(pka.BACK, pka.FRONT));
        ambientController.b(kcsVar, lziVarA.a());
    }
}
