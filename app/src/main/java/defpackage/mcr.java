package defpackage;

import android.net.Uri;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mcr implements tzt {
    private final /* synthetic */ int a;
    private final Object b;

    public mcr(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v60, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v66, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v69, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v73, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, tzx] */
    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                return new ggg((mcq) this.b.a(), (byte[]) null);
            case 1:
                return new lup(((luj) this.b.a()).a(luf.X));
            case 2:
                return ((CameraActivityTiming) this.b.a()).c;
            case 3:
                return ((ocq) this.b).a;
            case 4:
                Instrumentation instrumentation = (Instrumentation) this.b.a();
                Instrumentation.d(instrumentation);
                instrumentation.getClass();
                return instrumentation;
            case 5:
                return new gox((mdy) this.b.a());
            case 6:
                return new qpt((hbj) this.b.a());
            case 7:
                return new ocq(((imm) this.b).b(), (byte[]) null);
            case 8:
                ppt pptVarA = ppu.a(((imm) this.b).b());
                Uri uri = ral.a;
                pptVarA.g(uri);
                pptVarA.h(uri);
                pptVarA.c = "file_name";
                pptVarA.f();
                pptVarA.b();
                pptVarA.e = "restore_path";
                pptVarA.c();
                pptVarA.d(qpt.ag(1));
                pptVarA.e(qpt.ag(2));
                return pptVarA.a();
            case 9:
                return new ovx((Float) ((hbj) this.b.a()).e(gzy.m).get());
            case 10:
                return ((ocq) this.b).a;
            case 11:
                Set setP = jsv.p((rwc) this.b.a());
                setP.getClass();
                return setP;
            case 12:
                return new goq((mlg) this.b.a(), 5);
            case 13:
                return new mlw((mma) this.b.a());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Boolean.valueOf(((hbj) this.b.a()).o(has.c));
            case 15:
                pas pasVar = ((peq) this.b.a()).d;
                pasVar.getClass();
                return pasVar;
            case 16:
                moc mocVar = (moc) this.b.a();
                mocVar.getClass();
                return new ktp(mocVar, 6);
            case 17:
                return new mtx((hbj) this.b.a());
            case 18:
                return new mug((ScheduledExecutorService) this.b.a());
            case 19:
                return ((muk) this.b.a()).b;
            default:
                return ((muk) this.b.a()).c;
        }
    }
}
