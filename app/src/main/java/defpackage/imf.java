package defpackage;

import android.app.job.JobParameters;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.os.Build;
import com.google.android.apps.camera.keepalive.ProcessGcService;
import com.google.android.apps.camera.ui.layout.MainActivityLayout;
import j$.util.Optional;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class imf implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ imf(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [imj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, poj] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, pdk] */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object, rvu] */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object, mxl] */
    /* JADX WARN: Type inference failed for: r14v28, types: [java.lang.Object, pbp] */
    /* JADX WARN: Type inference failed for: r14v41, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r14v48, types: [cnh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v49, types: [java.lang.Object, kby] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, jub] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kfg] */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, IOException, NumberFormatException {
        double d;
        switch (this.c) {
            case 0:
                ?? r0 = this.b;
                Object obj = this.a;
                synchronized (imi.a) {
                    if (r0.equals(((imi) obj).q)) {
                        r0.j();
                    }
                }
                return;
            case 1:
                this.b.apply(((ile) this.a).d.getPreview(2));
                return;
            case 2:
                ((MainActivityLayout) ((ngx) this.b).a().c).h(this.a);
                return;
            case 3:
                ((jgt) this.a).k((isl) this.b.a());
                return;
            case 4:
                Object obj2 = this.b;
                ProcessGcService processGcService = (ProcessGcService) obj2;
                boolean zD = processGcService.d.d();
                Object obj3 = this.a;
                if (zD) {
                    ((sgt) ProcessGcService.a.c().M(2271)).s("Process is Alive! Rescheduling.");
                    processGcService.a(3);
                    processGcService.jobFinished((JobParameters) obj3, true);
                    return;
                } else {
                    processGcService.jobFinished((JobParameters) obj3, false);
                    processGcService.a(2);
                    processGcService.b.postDelayed(new ild(obj2, 18), 500L);
                    return;
                }
            case 5:
                Object obj4 = this.b;
                Object obj5 = ((itl) obj4).f;
                Object obj6 = this.a;
                synchronized (obj5) {
                    ((itl) obj4).b.remove(obj6);
                }
                return;
            case 6:
                Object obj7 = this.a;
                Object obj8 = ((itl) obj7).c;
                Object obj9 = this.b;
                synchronized (obj8) {
                    ((itl) obj7).d.remove(obj9);
                }
                return;
            case 7:
                Object obj10 = this.a;
                Object obj11 = ((itl) obj10).c;
                Object obj12 = this.b;
                synchronized (obj11) {
                    ((itl) obj10).d.add(obj12);
                }
                return;
            case 8:
                this.b.close();
                this.a.a();
                return;
            case 9:
                this.b.run();
                ((ivn) this.a).i.e.a(true);
                return;
            case 10:
                ivz ivzVar = (ivz) this.a;
                boolean z = ivzVar.k;
                Object obj13 = this.b;
                if (z) {
                    ((tht) obj13).d.run();
                    return;
                }
                pbn pbnVar = ivzVar.e;
                pbnVar.f("processPslFrame");
                ivzVar.c.h(ivzVar.d, (tht) obj13);
                pbnVar.g();
                return;
            case 11:
                ((iwb) this.b).h((iby) this.a, rvk.a);
                return;
            case 12:
                for (tht thtVar : this.b) {
                    thtVar.b.d();
                    thtVar.d.run();
                }
                ((ivq) this.a).d();
                return;
            case 13:
                ((iby) this.a).a();
                this.b.run();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((jbc) this.a).e(false, (pka) this.b);
                return;
            case 15:
                ((jav) this.a).b.e(false, (pka) this.b);
                return;
            case 16:
                ((jcd) this.b).f.h((Intent) this.a);
                return;
            case 17:
                try {
                    try {
                        Object obj14 = this.a;
                        String str = (String) ((jeg) obj14).E.remove(0);
                        FileOutputStream fileOutputStream = new FileOutputStream(str);
                        File file = new File(str);
                        file.toString();
                        jdw jdwVar = jdx.a;
                        if (Build.MODEL.startsWith("GalaxySZ")) {
                            Object obj15 = this.b;
                            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray((byte[]) obj15, 0, ((byte[]) obj15).length);
                            bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                            bitmapDecodeByteArray.recycle();
                        } else {
                            fileOutputStream.write((byte[]) this.b);
                        }
                        fileOutputStream.close();
                        int i = ((jeg) obj14).n;
                        List list = ((jeg) obj14).C;
                        if (i < list.size()) {
                            ((jfn) list.get(((jeg) obj14).n)).b = file.getAbsolutePath();
                        }
                        int length = ((byte[]) this.b).length;
                        ((jeg) obj14).m.get(((jeg) obj14).n);
                        ((jeg) obj14).D.remove(0);
                        try {
                            ((jeg) obj14).A.a.put(file.getAbsolutePath());
                            Object obj16 = this.a;
                            ((jeg) obj16).n++;
                            jel jelVar = ((jeg) obj16).F;
                            try {
                                String attribute = new ExifInterface(file.getAbsolutePath()).getAttribute("ExposureTime");
                                if (attribute != null) {
                                    try {
                                        d = Double.parseDouble(attribute);
                                    } catch (NumberFormatException unused) {
                                        d = -2.0d;
                                    }
                                } else {
                                    d = -1.0d;
                                }
                            } catch (IOException unused2) {
                                d = -3.0d;
                            }
                            jelVar.b = d;
                            jelVar.a();
                            return;
                        } catch (InterruptedException unused3) {
                            Thread.currentThread().interrupt();
                            throw new RuntimeException("Unexpected interruption");
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                        return;
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        return;
                    }
                } catch (IndexOutOfBoundsException e3) {
                    e3.printStackTrace();
                    return;
                }
            case 18:
                ?? r02 = this.b;
                this.a.accept(r02);
                r02.close();
                return;
            case 19:
                kfn kfnVar = new kfn();
                meu meuVar = new meu(new pqm() { // from class: jmu
                    @Override // defpackage.pqm
                    public final long a() {
                        return 0L;
                    }
                }, new pbl());
                Object obj17 = this.a;
                Optional optionalEmpty = Optional.empty();
                gga ggaVar = (gga) obj17;
                Object obj18 = ggaVar.a;
                this.b.e(ggaVar.c, (jtd) ggaVar.b, kfnVar, (kgw) obj18, false, false, 1, meuVar, optionalEmpty);
                return;
            default:
                sgv sgvVar = jnm.a;
                this.a.h((ltd) this.b);
                return;
        }
    }

    public imf(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }

    public /* synthetic */ imf(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
