package defpackage;

import android.content.Context;
import com.google.android.build.data.JKx.wzgaYJqO;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lme implements llg {
    public static final sgv a = sgv.g("lme");
    private static final ExecutorService d = ojl.bW("ImgShadowTask");
    public final llf b;
    public final Runnable c;
    private final lss e;

    public lme(lss lssVar) {
        llf llfVar = new llf();
        llfVar.e(1);
        this(llfVar, lssVar, rvk.a);
    }

    @Override // defpackage.llo
    public final /* synthetic */ lln a() {
        return this.e;
    }

    @Override // defpackage.llo
    public final String b() {
        return "ImageShadowTask-".concat(String.valueOf(String.valueOf(this.e.l())));
    }

    @Override // defpackage.llo
    public final void c(paf pafVar) {
        throw new RuntimeException("Not implemented yet");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [llf] */
    @Override // defpackage.llo
    public final void d(Context context) {
        try {
            try {
                try {
                    d.submit(new lmw(this, 1), null).get(5L, TimeUnit.MINUTES);
                } catch (ExecutionException e) {
                    ((sgt) ((sgt) a.c().i(e)).M(4225)).s("ImageShadowTask failed to complete.");
                } catch (TimeoutException unused) {
                    ((sgt) a.c().M(4226)).s("ImageShadowTask failed to complete after 5 minutes.");
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                ((sgt) ((sgt) a.c().i(e2)).M(4227)).s("ImageShadowTask failed because the future was interrupted.");
            }
        } finally {
            llf llfVar = this.b;
            llfVar.e(0);
            llfVar.d();
        }
    }

    @Override // defpackage.llo
    public final void f() {
    }

    @Override // defpackage.llo
    public final void g() {
    }

    @Override // defpackage.llg
    public final void h() {
        llf llfVar = this.b;
        llfVar.e(0);
        llfVar.d();
    }

    public lme(llf llfVar, lss lssVar, rwc rwcVar) {
        this.b = llfVar;
        this.e = lssVar;
        this.c = (Runnable) rwcVar.f();
    }

    @Override // defpackage.llo
    public final void e(paf pafVar) {
        throw new RuntimeException(wzgaYJqO.EmojXUS);
    }
}
