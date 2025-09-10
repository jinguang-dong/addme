package defpackage;

import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Trace;
import android.util.Log;
import android.view.MenuItem;
import androidx.work.impl.WorkDatabase;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;
import j$.time.Instant;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dwq implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public dwq(fu fuVar, tym tymVar, MenuItem menuItem, gb gbVar, int i) {
        this.e = i;
        this.d = fuVar;
        this.c = tymVar;
        this.b = menuItem;
        this.a = gbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.hardware.SensorEventListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v47, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.MenuItem, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, uif] */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.lang.Object, pbc] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, syu] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, jnz] */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.e) {
            case 0:
                Object obj = this.a;
                ?? r2 = this.b;
                Object obj2 = this.c;
                Object obj3 = this.d;
                boolean zIsEnabled = Trace.isEnabled();
                if (zIsEnabled) {
                    try {
                        coh.j((String) obj);
                    } finally {
                        if (zIsEnabled) {
                            Trace.endSection();
                        }
                    }
                }
                try {
                    r2.a();
                    dwn dwnVar = dwo.a;
                    ((cwq) obj2).i(dwnVar);
                    ((civ) obj3).c(dwnVar);
                } catch (Throwable th) {
                    ((cwq) obj2).i(new dwl(th));
                    ((civ) obj3).d(th);
                }
                if (zIsEnabled) {
                    return;
                } else {
                    return;
                }
            case 1:
                Object obj4 = this.c;
                if (obj4 != null) {
                    fv fvVar = ((fu) this.d).a;
                    fvVar.f = true;
                    ((gb) ((tym) obj4).b).i(false);
                    fvVar.f = false;
                }
                ?? r1 = this.b;
                if (r1.isEnabled() && r1.hasSubMenu()) {
                    ((gb) this.a).z(r1, 4);
                    return;
                }
                return;
            case 2:
                ?? r12 = this.b;
                int i = dxn.a;
                Iterator it = r12.iterator();
                while (it.hasNext()) {
                    ((dxl) it.next()).b(((ebm) this.a).a);
                }
                dxn.a((dvs) this.d, (WorkDatabase) this.c, r12);
                return;
            case 3:
                Object obj5 = this.c;
                ((fip) this.d).n(this.b, (rwu) this.a, (fon) obj5);
                return;
            case 4:
                grk grkVar = grk.MATTER;
                int iOrdinal = ((grk) this.a).ordinal();
                Object obj6 = this.b;
                Object obj7 = this.d;
                Object obj8 = this.c;
                switch (iOrdinal) {
                    case 0:
                        ((grj) obj8).d((Uri) obj7, "com.google.android.gms");
                        return;
                    case 1:
                        ((grj) obj8).c((String) obj6);
                        return;
                    case 2:
                        ((grj) obj8).d((Uri) obj7, "com.google.android.euicc");
                        return;
                    case 3:
                    case 4:
                        ((grj) obj8).b(new Intent("android.intent.action.VIEW").setData((Uri) obj7));
                        return;
                    case 5:
                        Intent intent = new Intent();
                        intent.setAction("android.settings.AUDIO_STREAM_DIALOG");
                        intent.putExtra("key_broadcast_metadata", (String) obj6);
                        ((grj) obj8).b(intent);
                        return;
                    case 6:
                        ((grj) obj8).d((Uri) obj7, "com.android.settings");
                        return;
                    case 7:
                        ((grj) obj8).a((Uri) obj7, (String) obj6);
                        return;
                    default:
                        return;
                }
            case 5:
                hez hezVar = new hez();
                Object obj9 = this.c;
                lte lteVar = (lte) obj9;
                long j = lteVar.b;
                hezVar.a = j;
                hezVar.b = lteVar.c;
                ltd ltdVar = lteVar.a;
                ltdVar.getClass();
                hezVar.i = ltdVar.toString();
                hezVar.j = lteVar.e;
                Object obj10 = this.b;
                long epochMilli = ((Instant) obj10).toEpochMilli();
                hezVar.c = epochMilli;
                hezVar.g = epochMilli;
                Object obj11 = this.a;
                hezVar.h = ((ltf) obj11).name();
                Object obj12 = this.d;
                try {
                    her herVar = ((hep) obj12).g;
                    dei.a(((hew) herVar).a, false, true, new dql(herVar, hezVar, 14, null));
                    ((hep) obj12).l(j, (Instant) obj10, obj9.toString() + " " + obj11.toString() + " started at " + String.valueOf(obj10));
                    return;
                } catch (SQLiteException e) {
                    ((hep) obj12).d.e(ojl.bI("SQLite error in startedImpl for id=%d '%s' time=%s type=%s", Long.valueOf(lteVar.b), obj9, obj10, obj11), e);
                    return;
                }
            case 6:
                ((hlw) this.a).g((Sensor) this.d);
                ((SensorManager) ((gox) this.b).b).unregisterListener((SensorEventListener) this.c);
                return;
            case 7:
                Object obj13 = this.b;
                ((hxo) this.d).a((iby) this.c, (InterleavedImageU8) this.a, (ShotMetadata) obj13);
                return;
            case 8:
                Object obj14 = this.a;
                Object obj15 = this.b;
                ((hzl) this.c).c((hxu) this.d, rwc.j(obj14), iea.a, false, (String) obj15);
                return;
            case 9:
                Object obj16 = this.b;
                ((ldr) this.a).h((iby) this.d, (ldq) this.c, (BurstSpec) obj16);
                return;
            case 10:
                Object obj17 = this.d;
                try {
                    boolean zH = ((lsc) obj17).d.h();
                    Object obj18 = this.c;
                    Object obj19 = this.a;
                    Object obj20 = this.b;
                    if (zH) {
                        ske.W(((lrw) obj17).z(), new jcb(obj17, 10), sxo.a);
                        ((lrw) obj17).z().f(((lsc) obj17).d.c().b((mfo) obj18, ((lsc) obj17).c.b(((lsc) obj17).O(), new ByteArrayInputStream((byte[]) obj20), ((lrw) obj17).p(), ((lrw) obj17).l()), ((lrw) obj17).j(), (rwc) obj19, ((lrw) obj17).f(), ((lrw) obj17).w(), ((lrw) obj17).o()));
                        return;
                    }
                    lsu lsuVarJ = ((lrw) obj17).j();
                    if (((rwc) obj19).h()) {
                        FileOutputStream fileOutputStreamE = lsuVarJ.b.e();
                        try {
                            OutputStream outputStreamM = ((ExifInterface) ((rwc) obj19).c()).m(fileOutputStreamE);
                            try {
                                edw edwVarM = pqw.m((byte[]) obj20);
                                pqw.p(edwVarM, hqp.NIGHT.e());
                                String[] strArr = pqq.a;
                                try {
                                    edy.a.c("http://ns.google.com/photos/1.0/camera/", "GCamera");
                                    for (int i2 = 0; i2 < 2; i2++) {
                                        edwVarM.g("DisableSuggestedAction", new eex(512), strArr[i2], new eex());
                                    }
                                } catch (edv e2) {
                                    Log.e("XmpUtil", "exception while appending disable suggested actions ".concat(String.valueOf(e2.getMessage())));
                                }
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                pqw.o((byte[]) obj20, byteArrayOutputStream, edwVarM, (edw) pqw.c(((ExifInterface) ((rwc) obj19).c()).bA).f());
                                outputStreamM.write(byteArrayOutputStream.toByteArray());
                                rwc rwcVarA = ((lsc) obj17).c.a(((lsc) obj17).O());
                                if (rwcVarA.h()) {
                                    idc.a((byte[]) rwcVarA.c(), ((lrw) obj17).p());
                                    int i3 = ((lrw) obj17).l().a;
                                    rwcVarA.c();
                                    outputStreamM.write((byte[]) rwcVarA.c());
                                } else {
                                    int i4 = ((lrw) obj17).l().a;
                                }
                                ((lrw) obj17).o().d(r0.length);
                                outputStreamM.close();
                                fileOutputStreamE.close();
                            } finally {
                            }
                        } finally {
                        }
                    } else {
                        ((lrw) obj17).o().d(prh.C((byte[]) obj20, lsuVarJ.b));
                    }
                    lsuVarJ.b();
                    ((lsc) obj17).P();
                    ((lrw) obj17).z().e(obj18);
                    return;
                } catch (IOException e3) {
                    ((lrw) obj17).z().a(e3);
                    return;
                }
            case 11:
                Object obj21 = this.c;
                Object obj22 = this.a;
                Object obj23 = this.b;
                Object obj24 = this.d;
                try {
                    lsu lsuVarJ2 = ((lrw) obj24).j();
                    ((lrw) obj24).o().d(prh.E((byte[]) obj23, (ExifInterface) ((rwc) obj22).f(), lsuVarJ2.b));
                    lsuVarJ2.b();
                    ((lrw) obj24).z().e(obj21);
                } catch (IOException e4) {
                    ((sgt) ((sgt) lsi.c.b().i(e4)).M((char) 4386)).s("CameraFileUtil.writeFile() throws : ");
                    ((lrw) obj24).z().a(e4);
                }
                ((lrw) obj24).r().g();
                return;
            default:
                ?? r13 = this.a;
                r13.f("FS.Shutdown");
                Object obj25 = this.b;
                ?? r3 = this.c;
                r3.b(mn.i(obj25, "Shutdown ", " started."));
                ((our) this.d).close();
                r3.f("Shutdown ".concat(String.valueOf(String.valueOf(obj25))));
                r13.g();
                return;
        }
    }

    public /* synthetic */ dwq(grj grjVar, grk grkVar, Uri uri, String str, int i) {
        this.e = i;
        this.c = grjVar;
        this.a = grkVar;
        this.d = uri;
        this.b = str;
    }

    public /* synthetic */ dwq(hep hepVar, lte lteVar, Instant instant, ltf ltfVar, int i) {
        this.e = i;
        this.d = hepVar;
        this.c = lteVar;
        this.b = instant;
        this.a = ltfVar;
    }

    public /* synthetic */ dwq(hxo hxoVar, iby ibyVar, InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata, int i) {
        this.e = i;
        this.d = hxoVar;
        this.c = ibyVar;
        this.a = interleavedImageU8;
        this.b = shotMetadata;
    }

    public /* synthetic */ dwq(hzl hzlVar, hxu hxuVar, icj icjVar, String str, int i) {
        this.e = i;
        this.c = hzlVar;
        this.d = hxuVar;
        this.a = icjVar;
        this.b = str;
    }

    public /* synthetic */ dwq(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.b = obj;
        this.a = obj2;
        this.d = obj3;
        this.c = obj4;
    }

    public /* synthetic */ dwq(Object obj, Object obj2, Object obj3, Object obj4, int i, byte[] bArr) {
        this.e = i;
        this.d = obj;
        this.b = obj2;
        this.a = obj3;
        this.c = obj4;
    }

    public /* synthetic */ dwq(String str, uif uifVar, cwq cwqVar, civ civVar, int i) {
        this.e = i;
        this.a = str;
        this.b = uifVar;
        this.c = cwqVar;
        this.d = civVar;
    }

    public /* synthetic */ dwq(ldr ldrVar, iby ibyVar, ldq ldqVar, BurstSpec burstSpec, int i) {
        this.e = i;
        this.a = ldrVar;
        this.d = ibyVar;
        this.c = ldqVar;
        this.b = burstSpec;
    }

    public /* synthetic */ dwq(pbn pbnVar, pbc pbcVar, pfr pfrVar, our ourVar, int i) {
        this.e = i;
        this.a = pbnVar;
        this.c = pbcVar;
        this.b = pfrVar;
        this.d = ourVar;
    }
}
