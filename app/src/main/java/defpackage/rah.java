package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;
import com.google.ar.core.R;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rah {
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public rah(owq owqVar, Context context, owf owfVar, owf owfVar2, hbj hbjVar) {
        this.c = owqVar;
        this.b = context;
        this.d = owfVar;
        this.e = owfVar2;
        this.a = hbjVar.p(gzo.bw);
    }

    public final syu a(String str) {
        qxf qxfVar = (qxf) this.b;
        qqe qqeVarE = qxfVar.e();
        Object obj = this.d;
        obj.getClass();
        str.getClass();
        return swz.i(qqe.d(((onm) qqeVarE.a).m((String) obj, str).a(sxo.a, new oog() { // from class: qyb
            @Override // defpackage.oog
            public final Object a(oor oorVar) {
                int i;
                qxz qxzVar;
                int i2;
                omx omxVar = (omx) oorVar.d();
                tpc tpcVarM = qxy.a.m();
                String str2 = omxVar.a;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar = tpcVarM.b;
                qxy qxyVar = (qxy) tphVar;
                str2.getClass();
                int i3 = 1;
                qxyVar.b |= 1;
                qxyVar.c = str2;
                String str3 = omxVar.c;
                if (!tphVar.C()) {
                    tpcVarM.o();
                }
                tph tphVar2 = tpcVarM.b;
                qxy qxyVar2 = (qxy) tphVar2;
                str3.getClass();
                int i4 = 4;
                qxyVar2.b |= 4;
                qxyVar2.e = str3;
                boolean z = omxVar.f;
                if (!tphVar2.C()) {
                    tpcVarM.o();
                }
                tph tphVar3 = tpcVarM.b;
                qxy qxyVar3 = (qxy) tphVar3;
                qxyVar3.b |= 8;
                qxyVar3.h = z;
                long j = omxVar.g;
                if (!tphVar3.C()) {
                    tpcVarM.o();
                }
                qxy qxyVar4 = (qxy) tpcVarM.b;
                qxyVar4.b |= 16;
                qxyVar4.i = j;
                byte[] bArr = omxVar.b;
                int i5 = 2;
                if (bArr != null) {
                    toj tojVarQ = toj.q(bArr);
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    qxy qxyVar5 = (qxy) tpcVarM.b;
                    qxyVar5.b |= 2;
                    qxyVar5.d = tojVarQ;
                }
                omw[] omwVarArr = omxVar.d;
                int length = omwVarArr.length;
                int i6 = 0;
                while (i6 < length) {
                    omw omwVar = omwVarArr[i6];
                    ond[] ondVarArr = omwVar.b;
                    int length2 = ondVarArr.length;
                    int i7 = 0;
                    while (i7 < length2) {
                        ond ondVar = ondVarArr[i7];
                        int i8 = ondVar.g;
                        if (i8 != i3) {
                            if (i8 != i5) {
                                if (i8 != 3) {
                                    if (i8 != i4) {
                                        if (i8 == 5) {
                                            tpc tpcVarM2 = qxz.a.m();
                                            String str4 = ondVar.a;
                                            i2 = i3;
                                            if (!tpcVarM2.b.C()) {
                                                tpcVarM2.o();
                                            }
                                            qxz qxzVar2 = (qxz) tpcVarM2.b;
                                            str4.getClass();
                                            qxzVar2.b |= 1;
                                            qxzVar2.e = str4;
                                            if (i8 == 5) {
                                                byte[] bArr2 = ondVar.f;
                                                ojl.ay(bArr2);
                                                toj tojVarQ2 = toj.q(bArr2);
                                                if (!tpcVarM2.b.C()) {
                                                    tpcVarM2.o();
                                                }
                                                qxz qxzVar3 = (qxz) tpcVarM2.b;
                                                qxzVar3.c = 5;
                                                qxzVar3.d = tojVarQ2;
                                                qxzVar = (qxz) tpcVarM2.l();
                                            } else {
                                                throw new IllegalArgumentException("Not a bytes type");
                                            }
                                        } else {
                                            throw new IllegalArgumentException(a.bv(i8, "Unrecognized flag type: "));
                                        }
                                    } else {
                                        i2 = i3;
                                        tpc tpcVarM3 = qxz.a.m();
                                        String str5 = ondVar.a;
                                        if (!tpcVarM3.b.C()) {
                                            tpcVarM3.o();
                                        }
                                        qxz qxzVar4 = (qxz) tpcVarM3.b;
                                        str5.getClass();
                                        qxzVar4.b |= 1;
                                        qxzVar4.e = str5;
                                        if (i8 == i4) {
                                            String str6 = ondVar.e;
                                            ojl.ay(str6);
                                            if (!tpcVarM3.b.C()) {
                                                tpcVarM3.o();
                                            }
                                            qxz qxzVar5 = (qxz) tpcVarM3.b;
                                            qxzVar5.c = i4;
                                            qxzVar5.d = str6;
                                            qxzVar = (qxz) tpcVarM3.l();
                                        } else {
                                            throw new IllegalArgumentException("Not a String type");
                                        }
                                    }
                                } else {
                                    i2 = i3;
                                    tpc tpcVarM4 = qxz.a.m();
                                    String str7 = ondVar.a;
                                    if (!tpcVarM4.b.C()) {
                                        tpcVarM4.o();
                                    }
                                    tph tphVar4 = tpcVarM4.b;
                                    qxz qxzVar6 = (qxz) tphVar4;
                                    str7.getClass();
                                    qxzVar6.b |= 1;
                                    qxzVar6.e = str7;
                                    if (i8 == 3) {
                                        double d = ondVar.d;
                                        if (!tphVar4.C()) {
                                            tpcVarM4.o();
                                        }
                                        qxz qxzVar7 = (qxz) tpcVarM4.b;
                                        qxzVar7.c = 3;
                                        qxzVar7.d = Double.valueOf(d);
                                        qxzVar = (qxz) tpcVarM4.l();
                                    } else {
                                        throw new IllegalArgumentException("Not a double type");
                                    }
                                }
                                i3 = i2;
                                i = 2;
                            } else {
                                int i9 = i3;
                                tpc tpcVarM5 = qxz.a.m();
                                String str8 = ondVar.a;
                                if (!tpcVarM5.b.C()) {
                                    tpcVarM5.o();
                                }
                                tph tphVar5 = tpcVarM5.b;
                                qxz qxzVar8 = (qxz) tphVar5;
                                str8.getClass();
                                qxzVar8.b |= 1;
                                qxzVar8.e = str8;
                                i = 2;
                                if (i8 == 2) {
                                    boolean z2 = ondVar.c;
                                    if (!tphVar5.C()) {
                                        tpcVarM5.o();
                                    }
                                    qxz qxzVar9 = (qxz) tpcVarM5.b;
                                    qxzVar9.c = 2;
                                    qxzVar9.d = Boolean.valueOf(z2);
                                    qxzVar = (qxz) tpcVarM5.l();
                                    i3 = i9;
                                } else {
                                    throw new IllegalArgumentException(mNLbzhCxd.ewzYH);
                                }
                            }
                        } else {
                            i = i5;
                            int i10 = i3;
                            tpc tpcVarM6 = qxz.a.m();
                            String str9 = ondVar.a;
                            if (!tpcVarM6.b.C()) {
                                tpcVarM6.o();
                            }
                            tph tphVar6 = tpcVarM6.b;
                            qxz qxzVar10 = (qxz) tphVar6;
                            str9.getClass();
                            qxzVar10.b |= 1;
                            qxzVar10.e = str9;
                            i3 = i10;
                            if (i8 == i3) {
                                long j2 = ondVar.b;
                                if (!tphVar6.C()) {
                                    tpcVarM6.o();
                                }
                                qxz qxzVar11 = (qxz) tpcVarM6.b;
                                qxzVar11.c = i3;
                                qxzVar11.d = Long.valueOf(j2);
                                qxzVar = (qxz) tpcVarM6.l();
                            } else {
                                throw new IllegalArgumentException("Not a long type");
                            }
                        }
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        qxy qxyVar6 = (qxy) tpcVarM.b;
                        qxzVar.getClass();
                        tpw tpwVar = qxyVar6.f;
                        if (!tpwVar.c()) {
                            qxyVar6.f = tph.v(tpwVar);
                        }
                        qxyVar6.f.add(qxzVar);
                        i7++;
                        i5 = i;
                        i4 = 4;
                    }
                    int i11 = i5;
                    String[] strArr = omwVar.c;
                    if (strArr != null) {
                        for (String str10 : strArr) {
                            if (!tpcVarM.b.C()) {
                                tpcVarM.o();
                            }
                            qxy qxyVar7 = (qxy) tpcVarM.b;
                            str10.getClass();
                            tpw tpwVar2 = qxyVar7.g;
                            if (!tpwVar2.c()) {
                                qxyVar7.g = tph.v(tpwVar2);
                            }
                            qxyVar7.g.add(str10);
                        }
                    }
                    i6++;
                    i5 = i11;
                    i4 = 4;
                }
                return (qxy) tpcVarM.l();
            }
        })), new rvu() { // from class: rad
            @Override // defpackage.rvu
            public final Object apply(Object obj2) {
                qxy qxyVar = (qxy) obj2;
                tpc tpcVarM = rai.a.m();
                if (qxyVar == null) {
                    return (rai) tpcVarM.l();
                }
                for (qxz qxzVar : qxyVar.f) {
                    tpc tpcVarM2 = raj.a.m();
                    String str2 = qxzVar.e;
                    if (!tpcVarM2.b.C()) {
                        tpcVarM2.o();
                    }
                    tph tphVar = tpcVarM2.b;
                    raj rajVar = (raj) tphVar;
                    str2.getClass();
                    rajVar.b |= 1;
                    rajVar.e = str2;
                    int i = qxzVar.c;
                    int iE = qsy.e(i);
                    if (iE == 0) {
                        throw null;
                    }
                    int i2 = iE - 1;
                    if (i2 == 0) {
                        long jLongValue = i == 1 ? ((Long) qxzVar.d).longValue() : 0L;
                        if (!tpcVarM2.b.C()) {
                            tpcVarM2.o();
                        }
                        raj rajVar2 = (raj) tpcVarM2.b;
                        rajVar2.c = 2;
                        rajVar2.d = Long.valueOf(jLongValue);
                    } else if (i2 == 1) {
                        boolean zBooleanValue = i == 2 ? ((Boolean) qxzVar.d).booleanValue() : false;
                        if (!tpcVarM2.b.C()) {
                            tpcVarM2.o();
                        }
                        raj rajVar3 = (raj) tpcVarM2.b;
                        rajVar3.c = 3;
                        rajVar3.d = Boolean.valueOf(zBooleanValue);
                    } else if (i2 == 2) {
                        double dDoubleValue = i == 3 ? ((Double) qxzVar.d).doubleValue() : 0.0d;
                        if (!tpcVarM2.b.C()) {
                            tpcVarM2.o();
                        }
                        raj rajVar4 = (raj) tpcVarM2.b;
                        rajVar4.c = 4;
                        rajVar4.d = Double.valueOf(dDoubleValue);
                    } else if (i2 == 3) {
                        String str3 = i == 4 ? (String) qxzVar.d : "";
                        if (!tphVar.C()) {
                            tpcVarM2.o();
                        }
                        raj rajVar5 = (raj) tpcVarM2.b;
                        str3.getClass();
                        rajVar5.c = 5;
                        rajVar5.d = str3;
                    } else {
                        if (i2 != 4) {
                            throw new IllegalStateException("No known flag type");
                        }
                        toj tojVar = i == 5 ? (toj) qxzVar.d : toj.b;
                        if (!tpcVarM2.b.C()) {
                            tpcVarM2.o();
                        }
                        raj rajVar6 = (raj) tpcVarM2.b;
                        tojVar.getClass();
                        rajVar6.c = 6;
                        rajVar6.d = tojVar;
                    }
                    raj rajVar7 = (raj) tpcVarM2.l();
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    rai raiVar = (rai) tpcVarM.b;
                    rajVar7.getClass();
                    tpw tpwVar = raiVar.g;
                    if (!tpwVar.c()) {
                        raiVar.g = tph.v(tpwVar);
                    }
                    raiVar.g.add(rajVar7);
                }
                String str4 = qxyVar.e;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar2 = tpcVarM.b;
                rai raiVar2 = (rai) tphVar2;
                str4.getClass();
                raiVar2.b = 4 | raiVar2.b;
                raiVar2.e = str4;
                String str5 = qxyVar.c;
                if (!tphVar2.C()) {
                    tpcVarM.o();
                }
                tph tphVar3 = tpcVarM.b;
                rai raiVar3 = (rai) tphVar3;
                str5.getClass();
                raiVar3.b = 1 | raiVar3.b;
                raiVar3.c = str5;
                long j = qxyVar.i;
                if (!tphVar3.C()) {
                    tpcVarM.o();
                }
                tph tphVar4 = tpcVarM.b;
                rai raiVar4 = (rai) tphVar4;
                raiVar4.b |= 8;
                raiVar4.f = j;
                if ((qxyVar.b & 2) != 0) {
                    toj tojVar2 = qxyVar.d;
                    if (!tphVar4.C()) {
                        tpcVarM.o();
                    }
                    rai raiVar5 = (rai) tpcVarM.b;
                    tojVar2.getClass();
                    raiVar5.b |= 2;
                    raiVar5.d = tojVar2;
                }
                return (rai) tpcVarM.l();
            }
        }, qxfVar.b());
    }

    public final syu b(rai raiVar) {
        return ske.Q(new fsu(this, raiVar, 12, null), ((qxf) this.b).b());
    }

    public final boolean c() {
        return ((qxf) this.b).e.b(this.a).a(tag.FILE);
    }

    public rah(Context context, mni mniVar, final uem uemVar, boolean z, final lqc lqcVar) {
        this.c = mniVar;
        this.a = z;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        View.inflate(context, R.layout.edu_bottomsheet, frameLayout);
        frameLayout.findViewById(R.id.learn_more_button).setOnClickListener(new fvp(context, 11));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        View.inflate(context, R.layout.setup_flow_bottomsheet, frameLayout2);
        frameLayout2.findViewById(R.id.photos_button).setOnClickListener(new View.OnClickListener() { // from class: myg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (!this.c.a) {
                    ((hne) uemVar.a()).a();
                    return;
                }
                lqc lqcVar2 = lqcVar;
                Intent intent = new Intent(lqcVar2.a, (Class<?>) lqcVar2.c);
                intent.putExtra("open_empty_vault", true);
                lqcVar2.b(intent, false);
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.e = frameLayout3;
        View.inflate(context, R.layout.ineligible_bottomsheet, frameLayout3);
        frameLayout3.findViewById(R.id.learn_more_button).setOnClickListener(new fvp(context, 12));
    }

    public rah(qxf qxfVar, String str, String str2, boolean z) {
        this.b = qxfVar;
        this.d = str;
        this.e = str2;
        this.a = z;
        Context context = qxfVar.c;
        Pattern pattern = rcl.a;
        rck rckVar = new rck(context);
        rckVar.d("phenotype");
        rckVar.e(str2 + "/" + str + ".pb");
        if (z) {
            int i = prt.a;
            rckVar.c();
        }
        this.c = rckVar.a();
    }
}
