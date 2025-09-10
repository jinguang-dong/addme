package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import com.google.ar.core.R;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dzd implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dzd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v31, types: [eyu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v32, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        int i = 2;
        switch (this.b) {
            case 0:
                dze dzeVar = (dze) this.a;
                if (dzeVar.e >= 2) {
                    dwj.b();
                    return;
                }
                ebm ebmVar = dzeVar.c;
                dzeVar.e = 2;
                dwj.b();
                Context context = dzeVar.a;
                String str = dza.a;
                Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                dza.f(intent, ebmVar);
                Executor executor = dzeVar.g;
                dzj dzjVar = dzeVar.d;
                int i2 = dzeVar.b;
                executor.execute(new dzg(dzjVar, intent, i2));
                if (!dzjVar.d.c(ebmVar.a)) {
                    dwj.b();
                    return;
                } else {
                    dwj.b();
                    executor.execute(new dzg(dzjVar, dza.d(context, ebmVar), i2));
                    return;
                }
            case 1:
                ((AtomicBoolean) this.a).set(true);
                return;
            case 2:
                Object obj = this.a;
                dze dzeVar2 = (dze) obj;
                if (dzeVar2.e != 0) {
                    dwj.b();
                    ebm ebmVar2 = dzeVar2.c;
                    Objects.toString(ebmVar2);
                    ebmVar2.toString();
                    return;
                }
                dzeVar2.e = 1;
                dwj.b();
                ebm ebmVar3 = dzeVar2.c;
                Objects.toString(ebmVar3);
                ebmVar3.toString();
                dzj dzjVar2 = dzeVar2.d;
                if (!dzjVar2.d.g(dzeVar2.m)) {
                    dzeVar2.a();
                    return;
                }
                edj edjVar = dzjVar2.c;
                synchronized (edjVar.c) {
                    dwj.b();
                    Objects.toString(ebmVar3);
                    edjVar.a(ebmVar3);
                    dxr dxrVar = new dxr(edjVar, ebmVar3, 3);
                    edjVar.a.put(ebmVar3, dxrVar);
                    edjVar.b.put(ebmVar3, obj);
                    edjVar.d.h(600000L, dxrVar);
                }
                return;
            case 3:
                ega egaVar = (ega) this.a;
                efy efyVar = egaVar.b;
                if (efyVar == null) {
                    return;
                }
                Object obj2 = efyVar.a;
                if (obj2 != null) {
                    egaVar.b(obj2);
                    return;
                } else {
                    egaVar.a(efyVar.b);
                    return;
                }
            case 4:
                emc emcVar = (emc) this.a;
                elu eluVar = emcVar.c;
                if (eluVar.b) {
                    eluVar.c.f.play(0);
                }
                emcVar.d.h();
                return;
            case 5:
                ((emq) this.a).a.h();
                return;
            case 6:
                ene eneVar = (ene) this.a;
                eneVar.a().removeCallbacksAndMessages(null);
                eneVar.a().obtainMessage(2).sendToTarget();
                return;
            case 7:
                ((enc) this.a).a.a();
                return;
            case 8:
                Object obj3 = ((end) this.a).b;
                synchronized (obj3) {
                    obj3.notifyAll();
                }
                return;
            case 9:
                Object obj4 = this.a;
                synchronized (obj4) {
                    obj4.notifyAll();
                }
                return;
            case 10:
                ((eop) this.a).s();
                return;
            case 11:
                ?? r6 = this.a;
                ((epl) r6).c.a(r6);
                return;
            case 12:
                Process.setThreadPriority(10);
                this.a.run();
                return;
            case 13:
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                fbp fbpVar = (fbp) this.a;
                rwc rwcVar = fbpVar.c;
                if (rwcVar.h()) {
                    ((mhe) rwcVar.c()).i();
                }
                fbpVar.d.l();
                fbpVar.a.c();
                return;
            case 15:
                ((FocusIndicatorView) this.a).l();
                return;
            case 16:
                ((fcv) this.a).e();
                return;
            case 17:
                ((du) this.a).b().show();
                return;
            case 18:
                Object obj5 = this.a;
                Context context2 = (Context) ((tdy) obj5).c;
                rkc rkcVar = new rkc(context2, R.style.Theme_Camera_MaterialAlertDialog);
                rkcVar.k(false);
                rkcVar.s(R.string.cant_save_photo_dialog_title);
                rkcVar.l(R.string.cant_save_photo_dialog_message);
                rkcVar.r(context2.getResources().getString(R.string.dialog_ok), new fdf(obj5, i));
                rkcVar.c();
                return;
            case 19:
                ((fdy) this.a).b();
                return;
            default:
                ((Activity) this.a).finish();
                return;
        }
        while (true) {
            Object obj6 = this.a;
            boolean z = ((ers) obj6).c;
            try {
                ((ers) obj6).c((err) ((ers) obj6).b.remove());
                erq erqVar = ((ers) obj6).d;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public dzd(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
