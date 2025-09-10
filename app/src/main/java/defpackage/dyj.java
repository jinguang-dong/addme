package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.google.ar.core.R;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dyj extends dws {
    public static final Object a;
    private static dyj l;
    private static dyj m;
    public Context b;
    public dvs c;
    public WorkDatabase d;
    public List e;
    public dxj f;
    public boolean g = false;
    public BroadcastReceiver.PendingResult h;
    public ejs i;
    public final hkk j;
    public gga k;
    private final und n;

    static {
        dwj.a("WorkManagerImpl");
        l = null;
        m = null;
        a = new Object();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, uhf] */
    public dyj(Context context, final dvs dvsVar, gga ggaVar, WorkDatabase workDatabase, final List list, dxj dxjVar, hkk hkkVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        dwj dwjVar = new dwj();
        synchronized (dwj.a) {
            if (dwj.b == null) {
                dwj.b = dwjVar;
            }
        }
        this.b = applicationContext;
        this.k = ggaVar;
        this.d = workDatabase;
        this.f = dxjVar;
        this.j = hkkVar;
        this.c = dvsVar;
        this.e = list;
        ggaVar.getClass();
        ?? r13 = ggaVar.d;
        r13.getClass();
        und undVarJ = ung.j(r13);
        this.n = undVarJ;
        final WorkDatabase workDatabase2 = this.d;
        this.i = new ejs(workDatabase2);
        dxj dxjVar2 = this.f;
        final ?? r10 = ggaVar.b;
        int i = dxn.a;
        dxjVar2.a(new dwy() { // from class: dxm
            @Override // defpackage.dwy
            public final void a(ebm ebmVar, boolean z) {
                int i2 = dxn.a;
                r10.execute(new dwq(list, ebmVar, dvsVar, workDatabase2, 2));
            }
        });
        this.k.f(new ecx(applicationContext, this));
        Context context2 = this.b;
        String str = dxu.a;
        context2.getClass();
        if (eda.a(context2, dvsVar)) {
            eby ebyVarB = workDatabase.B();
            dcu dcuVarA = dcu.a("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
            ecr ecrVar = (ecr) ebyVarB;
            dco dcoVar = ecrVar.a;
            asj asjVar = new asj(new eci(ecrVar, dcuVarA), 11);
            dcf dcfVarB = dcoVar.b();
            String[] strArr = (String[]) Arrays.copyOf(new String[]{"workspec"}, 1);
            strArr.getClass();
            ddi ddiVar = dcfVarB.b;
            ugw ugwVar = new ugw();
            for (String str2 : strArr) {
                Map map = ddiVar.b;
                String lowerCase = str2.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                Set set = (Set) map.get(lowerCase);
                if (set != null) {
                    ugwVar.addAll(set);
                } else {
                    ugwVar.add(str2);
                }
            }
            String[] strArr2 = (String[]) ske.aU(ugwVar).toArray(new String[0]);
            int length = strArr2.length;
            int[] iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                String str3 = strArr2[i2];
                Map map2 = ddiVar.d;
                String lowerCase2 = str3.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                Integer num = (Integer) map2.get(lowerCase2);
                if (num == null) {
                    throw new IllegalArgumentException("There is no table with name ".concat(String.valueOf(str3)));
                }
                iArr[i2] = num.intValue();
            }
            uev uevVar = new uev(strArr2, iArr);
            String[] strArr3 = (String[]) uevVar.a;
            int[] iArr2 = (int[]) uevVar.b;
            ddi ddiVar2 = dcfVarB.b;
            strArr3.getClass();
            iArr2.getClass();
            urd urdVar = new urd(new ddc(ddiVar2, iArr2, strArr3, (uhb) null, 0));
            cpn cpnVar = dcfVarB.h;
            ukc.C(undVarJ, null, 0, new htc(new urq(urn.a(ukc.H(new urq(new ddm(ukc.H(urdVar), dcoVar, asjVar), new dxs(null), 3))), new dxt(context2, null), 5), (uhb) null, 8), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    public static dyj a(Context context) {
        dyj dyjVarA;
        dcn dcnVarF;
        Object obj = a;
        synchronized (obj) {
            synchronized (obj) {
                dyjVarA = l;
                if (dyjVarA == null) {
                    dyjVarA = m;
                }
            }
            return dyjVarA;
        }
        if (dyjVarA == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof dvr)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            dvs dvsVarA = ((dvr) applicationContext).a();
            synchronized (obj) {
                dyj dyjVar = l;
                if (dyjVar != null && m != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (dyjVar == null) {
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    if (m == null) {
                        applicationContext2.getClass();
                        gga ggaVar = new gga(dvsVarA.c);
                        final Context applicationContext3 = applicationContext2.getApplicationContext();
                        applicationContext3.getClass();
                        ?? r3 = ggaVar.b;
                        r3.getClass();
                        if (applicationContext2.getResources().getBoolean(R.bool.workmanager_test_configuration)) {
                            dcnVarF = new dcn(applicationContext3, WorkDatabase.class, null);
                            dcnVarF.c();
                        } else {
                            dcnVarF = cvz.f(applicationContext3, WorkDatabase.class, "androidx.work.workdb");
                            dcnVarF.c = new dfd() { // from class: dxw
                                @Override // defpackage.dfd
                                public final dfe a(dfc dfcVar) {
                                    return new dfo().a(cog.o(applicationContext3, dfcVar.b, dfcVar.c, true, true));
                                }
                            };
                        }
                        dcnVarF.b = r3;
                        dcnVarF.a.add(new dwx());
                        dcnVarF.b(dxd.c);
                        dcnVarF.b(new dxk(applicationContext3, 2, 3));
                        dcnVarF.b(dxe.c);
                        dcnVarF.b(dxf.c);
                        dcnVarF.b(new dxk(applicationContext3, 5, 6));
                        dcnVarF.b(dxg.c);
                        dcnVarF.b(dxh.c);
                        dcnVarF.b(dxi.c);
                        dcnVarF.b(new dyk(applicationContext3));
                        dcnVarF.b(new dxk(applicationContext3, 10, 11));
                        dcnVarF.b(dwz.c);
                        dcnVarF.b(dxa.c);
                        dcnVarF.b(dxb.c);
                        dcnVarF.b(dxc.c);
                        dcnVarF.b(new dxk(applicationContext3, 21, 22));
                        dcnVarF.d();
                        WorkDatabase workDatabase = (WorkDatabase) dcnVarF.a();
                        Context applicationContext4 = applicationContext2.getApplicationContext();
                        applicationContext4.getClass();
                        Context applicationContext5 = applicationContext4.getApplicationContext();
                        applicationContext5.getClass();
                        eah eahVar = new eah(applicationContext5, ggaVar);
                        Context applicationContext6 = applicationContext4.getApplicationContext();
                        applicationContext6.getClass();
                        eaj eajVar = new eaj(applicationContext6, ggaVar);
                        Context applicationContext7 = applicationContext4.getApplicationContext();
                        applicationContext7.getClass();
                        String str = eat.a;
                        eas easVar = new eas(applicationContext7, ggaVar);
                        Context applicationContext8 = applicationContext4.getApplicationContext();
                        applicationContext8.getClass();
                        hkk hkkVar = new hkk(applicationContext4, (eap) eahVar, eajVar, (eap) easVar, (eap) new eau(applicationContext8, ggaVar));
                        dxj dxjVar = new dxj(applicationContext2.getApplicationContext(), dvsVarA, ggaVar, workDatabase);
                        workDatabase.getClass();
                        int i = dxn.a;
                        dzm dzmVar = new dzm(applicationContext2, workDatabase);
                        ecz.a(applicationContext2, SystemJobService.class, true);
                        dwj.b();
                        m = new dyj(applicationContext2.getApplicationContext(), dvsVarA, ggaVar, workDatabase, rnt.ae(new dxl[]{dzmVar, new dyx(applicationContext2, dvsVarA, hkkVar, dxjVar, new ebn(dxjVar, ggaVar), ggaVar)}), dxjVar, hkkVar);
                    }
                    l = m;
                }
                dyjVarA = a(applicationContext);
            }
        }
        return dyjVarA;
    }

    public final void b() {
        synchronized (a) {
            this.g = true;
            BroadcastReceiver.PendingResult pendingResult = this.h;
            if (pendingResult != null) {
                pendingResult.finish();
                this.h = null;
            }
        }
    }

    public final void c() {
        cij cijVar = this.c.h;
        dlc dlcVar = new dlc(this, 15);
        boolean zIsEnabled = Trace.isEnabled();
        if (zIsEnabled) {
            try {
                coh.j("ReschedulingWork");
            } catch (Throwable th) {
                if (zIsEnabled) {
                    Trace.endSection();
                }
                throw th;
            }
        }
        dlcVar.a();
        if (zIsEnabled) {
            Trace.endSection();
        }
    }

    public final void d(ebm ebmVar, int i) {
        this.k.f(new edc(this.f, new ejs(ebmVar), true, i));
    }
}
