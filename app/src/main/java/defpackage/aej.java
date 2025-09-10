package defpackage;

import android.hardware.camera2.CameraManager;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aej extends uht implements uiu {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aej(aen aenVar, akd akdVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.b = aenVar;
        this.c = akdVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return ((aej) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 1:
                return ((aej) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 2:
                return ((aej) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 3:
                return ((aej) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 4:
                return ((aej) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 5:
                return ((aej) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 6:
                return ((aej) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 7:
                return ((aej) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 8:
                return ((aej) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 9:
                return ((aej) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 10:
                return ((aej) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 11:
                return ((aej) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 12:
                return ((aej) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 13:
                return ((aej) c((und) obj, (uhb) obj2)).b(ufg.a);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return ((aej) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 15:
                return ((aej) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 16:
                return ((aej) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 17:
                return ((aej) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 18:
                return ((aej) c((und) obj, (uhb) obj2)).b(ufg.a);
            case 19:
                return ((aej) c((und) obj, (uhb) obj2)).b(ufg.a);
            default:
                return ((aej) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [akb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [akb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [akb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, uif] */
    /* JADX WARN: Type inference failed for: r0v32, types: [akb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r12v27, types: [atr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r13v36, types: [buo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v46, types: [atr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [azr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [aby, java.lang.Object] */
    @Override // defpackage.uhn
    public final Object b(Object obj) {
        long j;
        switch (this.d) {
            case 0:
                uhi uhiVar = uhi.a;
                if (this.a != 0) {
                    rnt.aN(obj);
                } else {
                    rnt.aN(obj);
                    Object obj2 = this.c;
                    ?? r0 = this.b;
                    this.a = 1;
                    if (((ocq) obj2).aE(r0, this) == uhiVar) {
                        return uhiVar;
                    }
                }
                return ufg.a;
            case 1:
                uhi uhiVar2 = uhi.a;
                if (this.a != 0) {
                    rnt.aN(obj);
                    return obj;
                }
                rnt.aN(obj);
                Object obj3 = this.b;
                Object obj4 = this.c;
                this.a = 1;
                uml umlVar = new uml(ske.aE(this), 1);
                umlVar.x();
                sg sgVar = new sg((String) obj4, umlVar);
                byz byzVar = (byz) obj3;
                CameraManager cameraManager = (CameraManager) byzVar.a.a();
                cameraManager.getClass();
                byi.bx(cameraManager, ((qrh) byzVar.b).m(), sgVar);
                umlVar.d(new azi(cameraManager, sgVar, 1));
                Object objI = umlVar.i();
                return objI == uhiVar2 ? uhiVar2 : objI;
            case 2:
                uhi uhiVar3 = uhi.a;
                if (this.a != 0) {
                    rnt.aN(obj);
                } else {
                    rnt.aN(obj);
                    Object obj5 = this.c;
                    ?? r02 = this.b;
                    this.a = 1;
                    if (((ocq) obj5).aE(r02, this) == uhiVar3) {
                        return uhiVar3;
                    }
                }
                return ufg.a;
            case 3:
                uhi uhiVar4 = uhi.a;
                if (this.a != 0) {
                    rnt.aN(obj);
                } else {
                    rnt.aN(obj);
                    ocq ocqVar = ((aen) this.b).h;
                    if (ocqVar != null) {
                        akc akcVar = new akc((akd) this.c);
                        this.a = 1;
                        if (ocqVar.aE(akcVar, this) == uhiVar4) {
                            return uhiVar4;
                        }
                    }
                }
                return ufg.a;
            case 4:
                uhi uhiVar5 = uhi.a;
                if (this.a != 0) {
                    rnt.aN(obj);
                } else {
                    rnt.aN(obj);
                    ocq ocqVar2 = ((aen) this.b).h;
                    if (ocqVar2 != 0) {
                        ?? r03 = this.c;
                        this.a = 1;
                        if (ocqVar2.aE(r03, this) == uhiVar5) {
                            return uhiVar5;
                        }
                    }
                }
                return ufg.a;
            case 5:
                uhi uhiVar6 = uhi.a;
                if (this.a != 0) {
                    rnt.aN(obj);
                } else {
                    rnt.aN(obj);
                    ocq ocqVar3 = ((aen) this.b).h;
                    if (ocqVar3 != null) {
                        ake akeVar = new ake((akd) this.c);
                        this.a = 1;
                        if (ocqVar3.aE(akeVar, this) == uhiVar6) {
                            return uhiVar6;
                        }
                    }
                }
                return ufg.a;
            case 6:
                uhi uhiVar7 = uhi.a;
                if (this.a != 0) {
                    rnt.aN(obj);
                } else {
                    rnt.aN(obj);
                    Object obj6 = this.b;
                    ?? r04 = this.c;
                    afs afsVar = afs.b;
                    this.a = 1;
                    if (((aji) obj6).i(afsVar, r04, this) == uhiVar7) {
                        return uhiVar7;
                    }
                }
                return ufg.a;
            case 7:
                uhi uhiVar8 = uhi.a;
                int i = this.a;
                if (i == 0) {
                    rnt.aN(obj);
                    this.a = 1;
                    throw null;
                }
                if (i != 1) {
                    rnt.aN(obj);
                } else {
                    rnt.aN(obj);
                    Object obj7 = this.b;
                    this.a = 2;
                    if (((ail) obj7).l(this) == uhiVar8) {
                        return uhiVar8;
                    }
                }
                return ufg.a;
            case 8:
                uhi uhiVar9 = uhi.a;
                if (this.a != 0) {
                    rnt.aN(obj);
                } else {
                    rnt.aN(obj);
                    ArrayList arrayList = new ArrayList();
                    Object obj8 = this.b;
                    aqk aqkVar = new aqk((List) arrayList, (azr) this.c, 1);
                    this.a = 1;
                    if (usx.f((usx) ((ocq) obj8).a, aqkVar, this) == uhiVar9) {
                        return uhiVar9;
                    }
                }
                return ufg.a;
            case 9:
                uhi uhiVar10 = uhi.a;
                if (this.a != 0) {
                    rnt.aN(obj);
                } else {
                    rnt.aN(obj);
                    ?? r13 = this.b;
                    ?? r05 = this.c;
                    this.a = 1;
                    if (blb.s(r13, r05, this) == uhiVar10) {
                        return uhiVar10;
                    }
                }
                return ufg.a;
            case 10:
                uhi uhiVar11 = uhi.a;
                if (this.a != 0) {
                    rnt.aN(obj);
                } else {
                    rnt.aN(obj);
                    Object obj9 = this.c;
                    this.a = 1;
                    ass assVar = (ass) obj9;
                    assVar.a = 6.0f;
                    assVar.b = 12.0f;
                    assVar.c = 8.0f;
                    assVar.d = 8.0f;
                    Object objB = assVar.b(this);
                    if (objB != uhiVar11) {
                        objB = ufg.a;
                    }
                    if (objB == uhiVar11) {
                        return uhiVar11;
                    }
                }
                return ufg.a;
            case 11:
                uhi uhiVar12 = uhi.a;
                if (this.a != 0) {
                    rnt.aN(obj);
                } else {
                    rnt.aN(obj);
                    Object obj10 = this.c;
                    ?? r06 = this.b;
                    this.a = 1;
                    if (((ass) obj10).a(r06, this) == uhiVar12) {
                        return uhiVar12;
                    }
                }
                return ufg.a;
            case 12:
                uhi uhiVar13 = uhi.a;
                if (this.a == 0) {
                    rnt.aN(obj);
                    ?? r132 = this.b;
                    if (r132 != 0) {
                        Object obj11 = this.c;
                        int iE = r132.e();
                        int i2 = iE - 1;
                        String strA = r132.a();
                        if (iE == 0) {
                            throw null;
                        }
                        long j2 = Long.MAX_VALUE;
                        if (i2 == 0) {
                            j = 4000;
                        } else if (i2 == 1) {
                            j = 10000;
                        } else {
                            if (i2 != 2) {
                                throw new uet();
                            }
                            j = Long.MAX_VALUE;
                        }
                        if (obj11 != null) {
                            if (j >= 2147483647L) {
                                j2 = j;
                            } else {
                                int recommendedTimeoutMillis = ((AccessibilityManager) ((ocq) obj11).a).getRecommendedTimeoutMillis((int) j, strA == null ? 3 : 7);
                                if (recommendedTimeoutMillis != Integer.MAX_VALUE) {
                                    j2 = recommendedTimeoutMillis;
                                }
                            }
                            j = j2;
                        }
                        this.a = 1;
                        if (ung.e(j, this) == uhiVar13) {
                            return uhiVar13;
                        }
                    }
                    return ufg.a;
                }
                rnt.aN(obj);
                this.b.c();
                return ufg.a;
            case 13:
                uhi uhiVar14 = uhi.a;
                if (this.a != 0) {
                    rnt.aN(obj);
                } else {
                    rnt.aN(obj);
                    Object obj12 = this.c;
                    Float f = new Float(0.0f);
                    ?? r2 = this.b;
                    this.a = 1;
                    if (abr.k(((avg) obj12).c, f, r2, null, this, 12) == uhiVar14) {
                        return uhiVar14;
                    }
                }
                return ufg.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                uhi uhiVar15 = uhi.a;
                if (this.a != 0) {
                    rnt.aN(obj);
                } else {
                    rnt.aN(obj);
                    Object obj13 = this.b;
                    crl crlVar = new crl(this.c, 1);
                    this.a = 1;
                    if (usx.f((usx) ((ocq) obj13).a, crlVar, this) == uhiVar15) {
                        return uhiVar15;
                    }
                }
                return ufg.a;
            case 15:
                uhi uhiVar16 = uhi.a;
                if (this.a != 0) {
                    rnt.aN(obj);
                } else {
                    rnt.aN(obj);
                    Object obj14 = this.c;
                    Object obj15 = this.b;
                    this.a = 1;
                    if (ung.i(new awy((awz) obj14, (apu) obj15, null), this) == uhiVar16) {
                        return uhiVar16;
                    }
                }
                return ufg.a;
            case 16:
                uhi uhiVar17 = uhi.a;
                if (this.a == 0) {
                    rnt.aN(obj);
                    awz awzVar = (awz) this.c;
                    abr abrVar = awzVar.e;
                    if (abrVar != null) {
                        Float f2 = new Float(((apu) this.b).a.a(awzVar.c, awzVar.d));
                        acn acnVar = awzVar.b;
                        this.a = 1;
                        obj = abr.k(abrVar, f2, acnVar, null, this, 12);
                        if (obj == uhiVar17) {
                            return uhiVar17;
                        }
                    }
                    return ufg.a;
                }
                rnt.aN(obj);
                return ufg.a;
            case 17:
                uhi uhiVar18 = uhi.a;
                if (this.a == 0) {
                    rnt.aN(obj);
                    awz awzVar2 = (awz) this.c;
                    abr abrVar2 = awzVar2.f;
                    if (abrVar2 != null) {
                        Float f3 = new Float(((apu) this.b).b.a(awzVar2.c, awzVar2.d));
                        acn acnVar2 = awzVar2.b;
                        this.a = 1;
                        obj = abr.k(abrVar2, f3, acnVar2, null, this, 12);
                        if (obj == uhiVar18) {
                            return uhiVar18;
                        }
                    }
                    return ufg.a;
                }
                rnt.aN(obj);
                return ufg.a;
            case 18:
                uhi uhiVar19 = uhi.a;
                if (this.a == 0) {
                    rnt.aN(obj);
                    awz awzVar3 = (awz) this.c;
                    abr abrVar3 = awzVar3.g;
                    if (abrVar3 != null) {
                        Float f4 = new Float(((apu) this.b).d.a(awzVar3.c, awzVar3.d));
                        acn acnVar3 = awzVar3.b;
                        this.a = 1;
                        obj = abr.k(abrVar3, f4, acnVar3, null, this, 12);
                        if (obj == uhiVar19) {
                            return uhiVar19;
                        }
                    }
                    return ufg.a;
                }
                rnt.aN(obj);
                return ufg.a;
            case 19:
                uhi uhiVar20 = uhi.a;
                if (this.a == 0) {
                    rnt.aN(obj);
                    awz awzVar4 = (awz) this.c;
                    abr abrVar4 = awzVar4.h;
                    if (abrVar4 != null) {
                        Float f5 = new Float(((apu) this.b).c.a(awzVar4.c, awzVar4.d));
                        acn acnVar4 = awzVar4.b;
                        this.a = 1;
                        obj = abr.k(abrVar4, f5, acnVar4, null, this, 12);
                        if (obj == uhiVar20) {
                            return uhiVar20;
                        }
                    }
                    return ufg.a;
                }
                rnt.aN(obj);
                return ufg.a;
            default:
                uhi uhiVar21 = uhi.a;
                int i3 = this.a;
                rnt.aN(obj);
                if (i3 == 0) {
                    Object obj16 = this.b;
                    this.a = 1;
                    if (((cav) obj16).b.c(0.0f, this) == uhiVar21) {
                        return uhiVar21;
                    }
                }
                ((cav) this.b).c.au(false);
                this.c.run();
                return ufg.a;
        }
    }

    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r7v14, types: [azr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, uif] */
    /* JADX WARN: Type inference failed for: r7v18, types: [akb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v21, types: [aby, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r9v11, types: [atr, java.lang.Object] */
    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        switch (this.d) {
            case 0:
                return new aej((ocq) this.c, (ajz) this.b, uhbVar, 0);
            case 1:
                return new aej((byz) this.b, (String) this.c, uhbVar, 1);
            case 2:
                return new aej((ocq) this.c, (aka) this.b, uhbVar, 2);
            case 3:
                return new aej((aen) this.b, (akd) this.c, uhbVar, 3);
            case 4:
                return new aej((aen) this.b, (akd) this.c, uhbVar, 4, (byte[]) null);
            case 5:
                return new aej((aen) this.b, (akd) this.c, uhbVar, 5, (char[]) null);
            case 6:
                return new aej((aji) this.b, (uiu) this.c, uhbVar, 6);
            case 7:
                return new aej((uol) null, (ail) this.b, uhbVar, 7);
            case 8:
                return new aej((ocq) this.b, (azr) this.c, uhbVar, 8);
            case 9:
                return new aej((apt) this.b, (uif) this.c, uhbVar, 9);
            case 10:
                return new aej((ass) this.c, (ase) this.b, uhbVar, 10);
            case 11:
                return new aej((ass) this.c, (akb) this.b, uhbVar, 11);
            case 12:
                return new aej((atr) this.b, (ocq) this.c, uhbVar, 12);
            case 13:
                return new aej((avg) this.c, (aby) this.b, uhbVar, 13);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new aej((ocq) this.b, (bgz) this.c, uhbVar, 14);
            case 15:
                return new aej((awz) this.c, (apz) this.b, uhbVar, 15);
            case 16:
                return new aej((awz) this.c, (apu) this.b, uhbVar, 16);
            case 17:
                return new aej((awz) this.c, (apu) this.b, uhbVar, 17, (byte[]) null);
            case 18:
                return new aej((awz) this.c, (apu) this.b, uhbVar, 18, (char[]) null);
            case 19:
                return new aej((awz) this.c, (apu) this.b, uhbVar, 19, (short[]) null);
            default:
                return new aej((cav) this.b, (Runnable) this.c, uhbVar, 20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aej(aen aenVar, akd akdVar, uhb uhbVar, int i, byte[] bArr) {
        super(2, uhbVar);
        this.d = i;
        this.b = aenVar;
        this.c = akdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aej(aen aenVar, akd akdVar, uhb uhbVar, int i, char[] cArr) {
        super(2, uhbVar);
        this.d = i;
        this.b = aenVar;
        this.c = akdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aej(aji ajiVar, uiu uiuVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.b = ajiVar;
        this.c = uiuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aej(apt aptVar, uif uifVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.b = aptVar;
        this.c = uifVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aej(ass assVar, akb akbVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.c = assVar;
        this.b = akbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aej(ass assVar, ase aseVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.c = assVar;
        this.b = aseVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aej(atr atrVar, ocq ocqVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.b = atrVar;
        this.c = ocqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aej(avg avgVar, aby abyVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.c = avgVar;
        this.b = abyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aej(awz awzVar, apu apuVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.c = awzVar;
        this.b = apuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aej(awz awzVar, apu apuVar, uhb uhbVar, int i, byte[] bArr) {
        super(2, uhbVar);
        this.d = i;
        this.c = awzVar;
        this.b = apuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aej(awz awzVar, apu apuVar, uhb uhbVar, int i, char[] cArr) {
        super(2, uhbVar);
        this.d = i;
        this.c = awzVar;
        this.b = apuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aej(awz awzVar, apu apuVar, uhb uhbVar, int i, short[] sArr) {
        super(2, uhbVar);
        this.d = i;
        this.c = awzVar;
        this.b = apuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aej(awz awzVar, apz apzVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.c = awzVar;
        this.b = apzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aej(byz byzVar, String str, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.b = byzVar;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aej(cav cavVar, Runnable runnable, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.b = cavVar;
        this.c = runnable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aej(ocq ocqVar, ajz ajzVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.c = ocqVar;
        this.b = ajzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aej(ocq ocqVar, aka akaVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.c = ocqVar;
        this.b = akaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aej(ocq ocqVar, azr azrVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.b = ocqVar;
        this.c = azrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aej(ocq ocqVar, bgz bgzVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.b = ocqVar;
        this.c = bgzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aej(uol uolVar, ail ailVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.d = i;
        this.c = null;
        this.b = ailVar;
    }
}
