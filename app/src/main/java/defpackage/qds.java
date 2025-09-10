package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qds implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final /* synthetic */ int d;

    public qds(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i) {
        this.d = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.d) {
            case 0:
                tzx tzxVar = this.b;
                Context contextB = ((imm) this.a).b();
                ree reeVar = (ree) tzxVar.a();
                rwc rwcVar = (rwc) ((tzu) this.c).a;
                Pattern pattern = rcl.a;
                rck rckVar = new rck(contextB);
                rckVar.d("mdd");
                rckVar.e(qsp.al("TaskPeriods", rwcVar));
                Uri uriA = rckVar.a();
                reb rebVarA = rec.a();
                rebVarA.e(uriA);
                rebVarA.d(qdr.a);
                return reeVar.a(rebVarA.a());
            case 1:
                tzx tzxVar2 = this.b;
                return new nze((CronetEngine) tzs.b(this.a).a(), (ScheduledExecutorService) tzxVar2.a(), ((hef) this.c).b().booleanValue());
            case 2:
                return new qmz((syx) this.b.a(), (qpf) this.c.a(), this.a);
            case 3:
                Object obj = ((tzu) this.a).a;
                final sjp sjpVarA = ((qpd) this.b).a();
                final rwc rwcVar2 = (rwc) obj;
                final tzx tzxVar3 = this.c;
                return new rbm() { // from class: qqu
                    @Override // defpackage.rbm
                    public final void a() {
                        if (((Boolean) rwcVar2.e(false)).booleanValue() && qpt.ad()) {
                            Iterator it = ((tzz) tzxVar3).a().iterator();
                            while (it.hasNext()) {
                                ((qqs) it.next()).cA();
                            }
                            sjpVarA.c();
                        }
                    }
                };
            case 4:
                return new qsm(((qqr) this.c).a(), tzs.b(this.a), (Executor) this.b.a());
            case 5:
                return new qso(tzs.b(this.b), (rwc) ((tzu) this.c).a, (Executor) this.a.a());
            case 6:
                return new qsy((byte[]) null);
            default:
                qsy qsyVar = (((rwc) ((tzu) this.c).a).h() || ((rwc) ((tzu) this.b).a).h()) ? (qsy) this.a.a() : new qsy((char[]) null);
                qsyVar.getClass();
                return qsyVar;
        }
    }

    public qds(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, char[] cArr) {
        this.d = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
    }

    public qds(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, int[] iArr) {
        this.d = i;
        this.c = tzxVar;
        this.a = tzxVar2;
        this.b = tzxVar3;
    }

    public qds(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, short[] sArr) {
        this.d = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
    }
}
