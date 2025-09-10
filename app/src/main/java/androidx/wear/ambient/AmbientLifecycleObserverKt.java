package androidx.wear.ambient;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import androidx.compose.ui.focus.FocusRequesterElement;
import androidx.wear.ambient.AmbientLifecycleObserver;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.wear.ambient.AmbientMode;
import androidx.wear.compose.foundation.rotary.FocusTargetWithSemanticsElement;
import androidx.wear.compose.foundation.rotary.RotaryHandlerElement;
import androidx.work.impl.WorkDatabase;
import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;
import com.google.ar.core.ImageMetadata;
import defpackage.a;
import defpackage.aci;
import defpackage.acv;
import defpackage.afy;
import defpackage.aga;
import defpackage.ajd;
import defpackage.akg;
import defpackage.akp;
import defpackage.aku;
import defpackage.alv;
import defpackage.amd;
import defpackage.aor;
import defpackage.apg;
import defpackage.apu;
import defpackage.apv;
import defpackage.apz;
import defpackage.awb;
import defpackage.axa;
import defpackage.ayb;
import defpackage.ayc;
import defpackage.ayg;
import defpackage.azr;
import defpackage.azz;
import defpackage.bai;
import defpackage.bap;
import defpackage.bay;
import defpackage.bbr;
import defpackage.bdq;
import defpackage.bfk;
import defpackage.bgx;
import defpackage.bib;
import defpackage.bic;
import defpackage.bie;
import defpackage.bih;
import defpackage.bik;
import defpackage.bjw;
import defpackage.bko;
import defpackage.bsr;
import defpackage.bum;
import defpackage.byi;
import defpackage.bze;
import defpackage.cbp;
import defpackage.chq;
import defpackage.cib;
import defpackage.cij;
import defpackage.cuw;
import defpackage.cux;
import defpackage.cvc;
import defpackage.cvi;
import defpackage.cvj;
import defpackage.djh;
import defpackage.dki;
import defpackage.dkl;
import defpackage.dks;
import defpackage.dku;
import defpackage.dkx;
import defpackage.dky;
import defpackage.dlh;
import defpackage.dli;
import defpackage.dlz;
import defpackage.dnj;
import defpackage.dob;
import defpackage.dod;
import defpackage.ebb;
import defpackage.edv;
import defpackage.edy;
import defpackage.eed;
import defpackage.eek;
import defpackage.een;
import defpackage.eer;
import defpackage.eex;
import defpackage.gga;
import defpackage.rnt;
import defpackage.ske;
import defpackage.ugl;
import defpackage.uif;
import defpackage.uiq;
import defpackage.uiu;
import defpackage.uiv;
import defpackage.ukc;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Node;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AmbientLifecycleObserverKt {
    public static final AmbientLifecycleObserver AmbientLifecycleObserver(Activity activity, AmbientLifecycleObserver.AmbientLifecycleCallback ambientLifecycleCallback) {
        activity.getClass();
        ambientLifecycleCallback.getClass();
        return new AmbientLifecycleObserverImpl(activity, new AmbientLifecycleObserverImpl$$ExternalSyntheticLambda0(0), ambientLifecycleCallback);
    }

    public static void B(String str) throws edv {
        if (str == null || str.length() == 0) {
            throw new edv("Empty schema namespace URI", 4);
        }
    }

    public static byte[] C(byte b) {
        int i = b & 255;
        if (i >= 128) {
            try {
                return (i == 129 || i == 141 || i == 143 || i == 144 || i == 157) ? new byte[]{32} : new String(new byte[]{b}, "cp1252").getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return new byte[]{b};
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.eee E(java.lang.String r14) throws defpackage.edv {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.ambient.AmbientLifecycleObserverKt.E(java.lang.String):eee");
    }

    public static String F(String str, int i) throws edv {
        if (i <= 0) {
            if (i == -1) {
                return str.concat("[last()]");
            }
            throw new edv("Array index must be larger than zero", 104);
        }
        return str + "[" + i + "]";
    }

    public static String G(String str, String str2) throws edv {
        if (str.length() == 0) {
            throw new edv("Empty field namespace URI", 101);
        }
        if (str2.length() == 0) {
            throw new edv("Empty f name", 102);
        }
        eer eerVarV = AmbientMode.AmbientCallback.v(str, str2);
        if (eerVarV.a() == 2) {
            return "/".concat(String.valueOf(eerVarV.b(1).a));
        }
        throw new edv("The field name must be simple", 102);
    }

    public static final int H(WorkDatabase workDatabase, String str) {
        Long lA = workDatabase.x().a(str);
        int iLongValue = lA != null ? (int) lA.longValue() : 0;
        I(workDatabase, str, iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0);
        return iLongValue;
    }

    public static final void I(WorkDatabase workDatabase, String str, int i) {
        workDatabase.x().b(new ebb(str, Long.valueOf(i)));
    }

    private static int J(Node node) {
        String localName = node.getLocalName();
        String namespaceURI = node.getNamespaceURI();
        if (namespaceURI == null && (("about".equals(localName) || "ID".equals(localName)) && (node instanceof Attr) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(((Attr) node).getOwnerElement().getNamespaceURI()))) {
            namespaceURI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
        }
        if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
            return 0;
        }
        if ("li".equals(localName)) {
            return 9;
        }
        if ("parseType".equals(localName)) {
            return 4;
        }
        if ("Description".equals(localName)) {
            return 8;
        }
        if ("about".equals(localName)) {
            return 3;
        }
        if ("resource".equals(localName)) {
            return 5;
        }
        if ("RDF".equals(localName)) {
            return 1;
        }
        if ("ID".equals(localName)) {
            return 2;
        }
        if ("nodeID".equals(localName)) {
            return 6;
        }
        if ("datatype".equals(localName)) {
            return 7;
        }
        if ("aboutEach".equals(localName)) {
            return 10;
        }
        if ("aboutEachPrefix".equals(localName)) {
            return 11;
        }
        return "bagID".equals(localName) ? 12 : 0;
    }

    private static een K(eek eekVar, een eenVar, Node node, String str, boolean z) throws edv {
        gga ggaVar = edy.a;
        String namespaceURI = node.getNamespaceURI();
        if (namespaceURI == null) {
            throw new edv("XML namespace required for all elements and attributes", 202);
        }
        if (true == "http://purl.org/dc/1.1/".equals(namespaceURI)) {
            namespaceURI = "http://purl.org/dc/elements/1.1/";
        }
        String strA = ggaVar.a(namespaceURI);
        if (strA == null) {
            strA = ggaVar.c(namespaceURI, node.getPrefix() != null ? node.getPrefix() : "_dflt");
        }
        String strValueOf = String.valueOf(node.getLocalName());
        eex eexVar = new eex();
        String strConcat = strA.concat(strValueOf);
        boolean z2 = false;
        if (z) {
            een eenVar2 = eekVar.a;
            eenVar = r(eenVar2, namespaceURI, "_dflt", true);
            eenVar.f = false;
            if (ggaVar.e(strConcat) != null) {
                eenVar2.g = true;
                eenVar.g = true;
                z2 = true;
            }
        }
        boolean zEquals = "rdf:li".equals(strConcat);
        boolean zEquals2 = "rdf:value".equals(strConcat);
        een eenVar3 = new een(strConcat, str, eexVar);
        eenVar3.h = z2;
        if (zEquals2) {
            eenVar.l(1, eenVar3);
            if (z || !eenVar.g().o()) {
                throw new edv("Misplaced rdf:value element", 202);
            }
            eenVar.i = true;
        } else {
            eenVar.k(eenVar3);
        }
        if (!zEquals) {
            return eenVar3;
        }
        if (!eenVar.g().d()) {
            throw new edv("Misplaced rdf:li element", 202);
        }
        eenVar3.a = "[]";
        return eenVar3;
    }

    private static void L(een eenVar) throws edv {
        een eenVarE = eenVar.e(1);
        if (eenVarE.g().c()) {
            if (eenVar.g().c()) {
                throw new edv("Redundant xml:lang for rdf:value element", 203);
            }
            een eenVarF = eenVarE.f(1);
            eenVarE.r(eenVarF);
            eenVar.m(eenVarF);
        }
        for (int i = 1; i <= eenVarE.b(); i++) {
            eenVar.m(eenVarE.f(i));
        }
        for (int i2 = 2; i2 <= eenVar.a(); i2++) {
            eenVar.m(eenVar.e(i2));
        }
        eenVar.i = false;
        eenVar.g().x(false);
        eenVar.g().b(eenVarE.g());
        eenVar.b = eenVarE.b;
        eenVar.q();
        Iterator itH = eenVarE.h();
        while (itH.hasNext()) {
            eenVar.k((een) itH.next());
        }
    }

    private static void N(eek eekVar, een eenVar, Node node, boolean z) throws edv {
        een eenVarK = K(eekVar, eenVar, node, null, z);
        for (int i = 0; i < node.getAttributes().getLength(); i++) {
            Node nodeItem = node.getAttributes().item(i);
            if (!"xmlns".equals(nodeItem.getPrefix()) && (nodeItem.getPrefix() != null || !"xmlns".equals(nodeItem.getNodeName()))) {
                String namespaceURI = nodeItem.getNamespaceURI();
                String localName = nodeItem.getLocalName();
                if ("xml:lang".equals(nodeItem.getNodeName())) {
                    P(eenVarK, "xml:lang", nodeItem.getNodeValue());
                } else if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI) || (!"ID".equals(localName) && !"datatype".equals(localName))) {
                    throw new edv("Invalid attribute for literal property element", 202);
                }
            }
        }
        String strConcat = "";
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); i2++) {
            Node nodeItem2 = node.getChildNodes().item(i2);
            if (nodeItem2.getNodeType() != 3) {
                throw new edv("Invalid child of literal property element", 202);
            }
            strConcat = strConcat.concat(String.valueOf(nodeItem2.getNodeValue()));
        }
        eenVarK.b = strConcat;
    }

    private static void P(een eenVar, String str, String str2) {
        if ("xml:lang".equals(str)) {
            str2 = eed.a(str2);
        }
        eenVar.m(new een(str, str2, null));
    }

    public static final float a(float f, float f2, float f3) {
        return ukc.m((f3 - f) / (f2 - f), 0.0f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.dkl b(int r13, defpackage.anb r14, int r15, int r16, int r17, defpackage.dli r18, int r19, boolean r20) {
        /*
            r0 = r16
            r1 = r17
            r2 = r19
            int r8 = r14.h
            int r3 = r13 + r8
            float r4 = (float) r0
            int r5 = r3 - r15
            r6 = 0
            int r7 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            int r9 = r13 - r15
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r7 <= 0) goto L64
            int r7 = r5 - r9
            int r11 = r0 - r9
            int r11 = java.lang.Math.min(r11, r5)
            float r11 = (float) r11
            float r11 = r11 / r4
            float r7 = (float) r7
            float r7 = r7 / r4
            r18.f()
            r18.d()
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            r12 = 1058642330(0x3f19999a, float:0.6)
            float r4 = a(r4, r12, r7)
            r18.g()
            r18.e()
            r7 = 1051931443(0x3eb33333, float:0.35)
            r12 = 1057803469(0x3f0ccccd, float:0.55)
            float r4 = defpackage.chp.x(r7, r12, r4)
            int r7 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r7 >= 0) goto L64
            float r11 = r11 / r4
            float r4 = r10 - r11
            ack r7 = r18.c()
            float r4 = r7.a(r4)
            float r7 = r18.b()
            float r7 = defpackage.chp.x(r10, r7, r4)
            float r11 = r18.a()
            float r10 = defpackage.chp.x(r10, r11, r4)
            r4 = r10
            r10 = r7
            goto L65
        L64:
            r4 = r10
        L65:
            dkt r7 = new dkt
            r7.<init>(r10, r4)
            int r5 = r5 + r9
            float r4 = (float) r8
            r9 = r6
            float r6 = r7.a
            float r4 = r4 * r6
            int r4 = defpackage.ukj.x(r4)
            if (r5 >= r0) goto L78
            int r13 = r3 - r4
        L78:
            int r13 = c(r13, r1, r2, r4)
            int r0 = r14.g
            int r3 = c(r0, r1, r2, r8)
            int r0 = r14.a
            int r1 = r0 + (-1)
            java.lang.Object r2 = r14.d
            dkl r0 = new dkl
            if (r20 == 0) goto L90
            float r14 = r7.b
            r7 = r14
            goto L91
        L90:
            r7 = r9
        L91:
            r5 = r4
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.ambient.AmbientLifecycleObserverKt.b(int, anb, int, int, int, dli, int, boolean):dkl");
    }

    public static final int c(int i, int i2, int i3, int i4) {
        return (i - i2) + i3 + (a.p(0, 1) ? 0 : i4 / 2);
    }

    public static final float d(dkl dklVar) {
        return dklVar.b - (a.p(0, 0) ? dklVar.g / 2.0f : 0.0f);
    }

    public static final bik e(bik bikVar, uif uifVar) {
        return byi.r(bikVar, new dku(uifVar, 0));
    }

    public static final boolean f(azr azrVar) {
        return ((Boolean) azrVar.a()).booleanValue();
    }

    public static final void g(int i, dlh dlhVar, dky dkyVar, uiv uivVar, ayc aycVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        ayc aycVarC = aycVar.c(1278167514);
        int i5 = 2;
        if (i4 == 0) {
            i3 = (true != aycVarC.z(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != aycVarC.B(dlhVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != aycVarC.B(dkyVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != aycVarC.D(uivVar) ? 1024 : 2048;
        }
        if (aycVarC.H((i3 & 1171) != 1170, i3 & 1)) {
            boolean z = (i3 & ScriptIntrinsicBLAS.TRANSPOSE) == 32;
            boolean z2 = (i3 & 14) == 4;
            bih bihVar = bik.c;
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if ((z2 | z) || objR == ayb.a) {
                objR = new bgx(dlhVar, i, i5);
                aygVar.ac(objR);
            }
            bik bikVarC = bko.c(bihVar, (uiq) objR);
            bsr bsrVarC = aku.c(bib.f, false);
            int iM = bay.M(aycVarC);
            bfk bfkVarAg = aygVar.ag();
            bik bikVarV = bay.v(aycVarC, bikVarC);
            uif uifVar = bum.a;
            aycVarC.v();
            if (aygVar.v) {
                aycVarC.j(uifVar);
            } else {
                aycVarC.x();
            }
            bbr.a(aycVarC, bsrVarC, bum.d);
            bbr.a(aycVarC, bfkVarAg, bum.c);
            uiu uiuVar = bum.e;
            if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iM))) {
                Integer numValueOf = Integer.valueOf(iM);
                aygVar.ac(numValueOf);
                aycVarC.h(numValueOf, uiuVar);
            }
            bbr.a(aycVarC, bikVarV, bum.b);
            uivVar.a(dkyVar, aycVarC, Integer.valueOf((i3 >> 6) & 126));
            aycVarC.m();
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new aor(i, dlhVar, dkyVar, uivVar, i2, 2);
        }
    }

    public static final void h(bik bikVar, final dlh dlhVar, alv alvVar, final akp akpVar, final bic bicVar, apg apgVar, boolean z, dli dliVar, final dki dkiVar, dnj dnjVar, afy afyVar, final uiq uiqVar, ayc aycVar, final int i, final int i2) {
        bik bikVar2;
        int i3;
        akp akpVar2;
        int i4;
        final alv alvVar2;
        final apg apgVar2;
        final boolean z2;
        final dli dliVar2;
        final dnj dnjVar2;
        final afy afyVar2;
        alv alvVarAJ;
        dli dksVar;
        afy afyVarB;
        boolean z3;
        apg apgVar3;
        dnj dnjVar3;
        alv alvVar3;
        ayc aycVarC = aycVar.c(-746761427);
        if ((i & 6) == 0) {
            bikVar2 = bikVar;
            i3 = (true != aycVarC.B(bikVar2) ? 2 : 4) | i;
        } else {
            bikVar2 = bikVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != aycVarC.B(dlhVar) ? 16 : 32;
        }
        int i5 = i3 | 3456;
        if ((i & 24576) == 0) {
            akpVar2 = akpVar;
            i5 |= true != aycVarC.B(akpVar2) ? 8192 : 16384;
        } else {
            akpVar2 = akpVar;
        }
        if ((196608 & i) == 0) {
            i5 |= true != aycVarC.B(bicVar) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        }
        if ((1572864 & i) == 0) {
            i5 |= ImageMetadata.LENS_APERTURE;
        }
        int i6 = 12582912 | i5;
        if ((100663296 & i) == 0) {
            i6 = i5 | 46137344;
        }
        if ((i2 & 6) == 0) {
            i4 = (true != aycVarC.B(dkiVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != aycVarC.D(uiqVar) ? 1024 : 2048;
        }
        int i7 = 805306368 | i6;
        if (aycVarC.H(((306783379 & i7) == 306783378 && (i4 & 1171) == 1170) ? false : true, i7 & 1)) {
            aycVarC.s();
            if ((i & 1) == 0 || aycVarC.E()) {
                alvVarAJ = byi.aJ(10.0f, 2);
                apg apgVarAP = byi.aP(aycVarC);
                dksVar = new dks(new aci(0.3f, 0.0f, 0.7f, 1.0f), new axa(9), 1);
                dnj dnjVarG = AmbientLifecycleObserver.AmbientLifecycleCallback.CC.g(dlhVar, aycVarC);
                afyVarB = aga.b(aycVarC);
                z3 = true;
                apgVar3 = apgVarAP;
                dnjVar3 = dnjVarG;
            } else {
                aycVarC.r();
                alvVarAJ = alvVar;
                apgVar3 = apgVar;
                z3 = z;
                dksVar = dliVar;
                dnjVar3 = dnjVar;
                afyVarB = afyVar;
            }
            aycVarC.l();
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            Object obj = ayb.a;
            if (objR == obj) {
                alvVar3 = alvVarAJ;
                azz azzVar = new azz(false, bap.c);
                aygVar.ac(azzVar);
                objR = azzVar;
            } else {
                alvVar3 = alvVarAJ;
            }
            azr azrVar = (azr) objR;
            Object objR2 = aygVar.R();
            if (objR2 == obj) {
                objR2 = new bjw();
                aygVar.ac(objR2);
            }
            bik bikVarM = (dnjVar3 == null || !z3) ? bikVar2 : m(WearableControllerProvider.a(bikVar2), dnjVar3, (bjw) objR2, afyVarB);
            alv alvVar4 = alvVar3;
            dnj dnjVar4 = dnjVar3;
            dli dliVar3 = dksVar;
            akg.e(bikVarM, null, bdq.k(-1441548265, new dkx(dliVar3, alvVar4, dlhVar, akpVar2, dkiVar, bicVar, apgVar3, z3, afyVarB, uiqVar, azrVar), aycVarC), aycVarC, 3456);
            alvVar2 = alvVar4;
            apgVar2 = apgVar3;
            z2 = z3;
            afyVar2 = afyVarB;
            dnjVar2 = dnjVar4;
            dliVar2 = dliVar3;
        } else {
            aycVarC.r();
            alvVar2 = alvVar;
            apgVar2 = apgVar;
            z2 = z;
            dliVar2 = dliVar;
            dnjVar2 = dnjVar;
            afyVar2 = afyVar;
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            final bik bikVar3 = bikVar2;
            baiVarI.d = new uiu() { // from class: dkw
                @Override // defpackage.uiu
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    bik bikVar4 = bikVar3;
                    dlh dlhVar2 = dlhVar;
                    alv alvVar5 = alvVar2;
                    akp akpVar3 = akpVar;
                    bic bicVar2 = bicVar;
                    apg apgVar4 = apgVar2;
                    boolean z4 = z2;
                    dli dliVar4 = dliVar2;
                    dki dkiVar2 = dkiVar;
                    dnj dnjVar5 = dnjVar2;
                    afy afyVar3 = afyVar2;
                    int i8 = i;
                    AmbientLifecycleObserverKt.h(bikVar4, dlhVar2, alvVar5, akpVar3, bicVar2, apgVar4, z4, dliVar4, dkiVar2, dnjVar5, afyVar3, uiqVar, (ayc) obj2, bay.j(i8 | 1), bay.j(i2));
                    return ufg.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r11 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (r11 != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0079 -> B:23:0x007b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(defpackage.uif r10, defpackage.uhb r11) {
        /*
            boolean r0 = r11 instanceof defpackage.dog
            if (r0 == 0) goto L13
            r0 = r11
            dog r0 = (defpackage.dog) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dog r0 = new dog
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.b
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r4 = r0.a
            dlc r10 = r0.d
            defpackage.rnt.aN(r11)
            goto L7b
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            dlc r10 = r0.d
            defpackage.rnt.aN(r11)
            goto L53
        L3c:
            defpackage.rnt.aN(r11)
            axa r11 = new axa
            r2 = 13
            r11.<init>(r2)
            r2 = r10
            dlc r2 = (defpackage.dlc) r2
            r0.d = r2
            r0.c = r4
            java.lang.Object r11 = defpackage.bay.n(r11, r0)
            if (r11 == r1) goto L8c
        L53:
            java.lang.Number r11 = (java.lang.Number) r11
            long r4 = r11.longValue()
        L59:
            java.lang.Object r11 = r10.a()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L89
            axa r11 = new axa
            r2 = 14
            r11.<init>(r2)
            r2 = r10
            dlc r2 = (defpackage.dlc) r2
            r0.d = r2
            r0.a = r4
            r0.c = r3
            java.lang.Object r11 = defpackage.bay.n(r11, r0)
            if (r11 == r1) goto L8c
        L7b:
            java.lang.Number r11 = (java.lang.Number) r11
            long r6 = r11.longValue()
            long r6 = r6 - r4
            r8 = 1000(0x3e8, double:4.94E-321)
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 > 0) goto L89
            goto L59
        L89:
            ufg r10 = defpackage.ufg.a
            return r10
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.ambient.AmbientLifecycleObserverKt.i(uif, uhb):java.lang.Object");
    }

    public static final void j(final String str, dob dobVar, uif uifVar, bik bikVar, bie bieVar, ayc aycVar, int i) {
        int i2;
        final uif uifVar2;
        bie bieVar2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(1440969827);
        if (i3 == 0) {
            i2 = (true != aycVarC.B(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.D(dobVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            uifVar2 = uifVar;
            i2 |= true != aycVarC.D(uifVar2) ? 128 : 256;
        } else {
            uifVar2 = uifVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.B(bikVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            bieVar2 = bieVar;
            i2 |= true != aycVarC.B(bieVar2) ? 8192 : 16384;
        } else {
            bieVar2 = bieVar;
        }
        if (aycVarC.H((i2 & 9363) != 9362, i2 & 1)) {
            chq chqVar = (chq) aycVarC.e(bze.c);
            cib cibVar = (cib) aycVarC.e(bze.h);
            final boolean zBooleanValue = ((Boolean) aycVarC.e(djh.a)).booleanValue();
            boolean zB = aycVarC.B(dobVar) | aycVarC.z(cibVar.ordinal()) | aycVarC.B(chqVar);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (zB || objR == ayb.a) {
                objR = new dod(dobVar, cibVar, chqVar);
                aygVar.ac(objR);
            }
            final dod dodVar = (dod) objR;
            dodVar.b(str);
            bik bikVarD = amd.d(bikVar, dodVar.a());
            int i4 = i2 & 14;
            Object objR2 = aygVar.R();
            if (i4 == 4 || objR2 == ayb.a) {
                objR2 = new dlz(str, 6);
                aygVar.ac(objR2);
            }
            bik bikVarB = cbp.b(bikVarD, false, (uiq) objR2);
            boolean zC = aycVarC.C(zBooleanValue) | aycVarC.D(dodVar);
            boolean z = i4 == 4;
            boolean z2 = (i2 & 896) == 256;
            boolean z3 = (i2 & 57344) == 16384;
            Object objR3 = aygVar.R();
            if ((z3 | z | zC | z2) || objR3 == ayb.a) {
                final bie bieVar3 = bieVar2;
                uiq uiqVar = new uiq() { // from class: doc
                    @Override // defpackage.uiq
                    public final Object a(Object obj) throws IOException {
                        float fFloatValue;
                        bmv bmvVar = (bmv) obj;
                        dod dodVar2 = dodVar;
                        if (zBooleanValue) {
                            dodVar2.b(str);
                            fFloatValue = 1.0f;
                        } else {
                            fFloatValue = ((Number) uifVar2.a()).floatValue();
                        }
                        Canvas canvasA = bkk.a(bmvVar.o().b());
                        if (!a.q(dodVar2.a(), 0L)) {
                            bie bieVar4 = bieVar3;
                            float fX = chp.x(dodVar2.k, dodVar2.l, fFloatValue);
                            float fX2 = chp.x(dodVar2.d, dodVar2.e, fFloatValue);
                            long jA = bieVar4.a((ukj.x(fX) << 32) | (ukj.x(fX2) & 4294967295L), dodVar2.c, dodVar2.b);
                            canvasA.translate(chy.a(jA), chy.b(jA) + (fX2 / 2.0f) + (chp.y(dodVar2.f, dodVar2.g, fFloatValue) / 2) + (chp.y(dodVar2.h, dodVar2.i, fFloatValue) / 4));
                            dob dobVar2 = dodVar2.a;
                            Font fontA = dobVar2.a(dodVar2.j, fFloatValue);
                            dobVar2.c.setTextSize(chp.x(dobVar2.a, dobVar2.b, fFloatValue));
                            PositionedGlyphs positionedGlyphs = dodVar2.m;
                            positionedGlyphs.getClass();
                            PositionedGlyphs positionedGlyphs2 = dodVar2.n;
                            positionedGlyphs2.getClass();
                            int iGlyphCount = positionedGlyphs.glyphCount();
                            int i5 = 0;
                            while (i5 < iGlyphCount) {
                                Font font = positionedGlyphs.getFont(i5);
                                int[] iArr = {positionedGlyphs.getGlyphId(i5)};
                                int i6 = i5;
                                float[] fArr = {chp.x(positionedGlyphs.getGlyphX(i5), positionedGlyphs2.getGlyphX(i5), fFloatValue), chp.x(positionedGlyphs.getGlyphY(i5), positionedGlyphs2.getGlyphY(i5), fFloatValue)};
                                File file = fontA.getFile();
                                String name = file != null ? file.getName() : null;
                                File file2 = font.getFile();
                                if (true == a.ao(name, file2 != null ? file2.getName() : null)) {
                                    font = fontA;
                                }
                                canvasA.drawGlyphs(iArr, 0, fArr, 0, 1, font, dobVar2.c);
                                i5 = i6 + 1;
                            }
                        }
                        return ufg.a;
                    }
                };
                aygVar.ac(uiqVar);
                objR3 = uiqVar;
            }
            acv.c(bikVarB, (uiq) objR3, aycVarC, 0);
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new awb(str, dobVar, uifVar, bikVar, bieVar, i, 3);
        }
    }

    public static final cvj k(apu apuVar, long j, chq chqVar, cib cibVar) {
        long j2;
        apv apvVar;
        char c;
        float f;
        char c2;
        char c3;
        int i;
        if (!(apuVar instanceof apz)) {
            return null;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        cuw[] cuwVarArr = new cuw[4];
        cib cibVar2 = cib.a;
        char c4 = 2;
        int i2 = 0;
        cuwVarArr[0] = new cuw((cibVar == cibVar2 ? apuVar.c : apuVar.d).a(j, chqVar), 2);
        if (cibVar == cibVar2) {
            j2 = 4294967295L;
            apvVar = apuVar.d;
        } else {
            j2 = 4294967295L;
            apvVar = apuVar.c;
        }
        cuw cuwVar = new cuw(apvVar.a(j, chqVar), 2);
        char c5 = 1;
        cuwVarArr[1] = cuwVar;
        cuwVarArr[2] = new cuw((cibVar == cibVar2 ? apuVar.a : apuVar.b).a(j, chqVar), 2);
        char c6 = 3;
        cuwVarArr[3] = new cuw((cibVar == cibVar2 ? apuVar.b : apuVar.a).a(j, chqVar), 2);
        List listAe = rnt.ae(cuwVarArr);
        float f2 = 2.0f;
        float f3 = fIntBitsToFloat / 2.0f;
        float f4 = f3 + 0.0f;
        float f5 = fIntBitsToFloat2 / 2.0f;
        float f6 = f5 + 0.0f;
        float f7 = -f3;
        float f8 = -f5;
        cvj cvjVarH = cij.h(new float[]{f4, f6, f7, f6, f7, f8, f4, f8}, cuw.a, listAe, 0.0f, 0.0f);
        List list = cvjVarH.c;
        float[] fArr = new float[4];
        int i3 = ((ugl) list).c;
        float fMax = Float.MIN_VALUE;
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        int i4 = 0;
        float fMax2 = Float.MIN_VALUE;
        while (i4 < i3) {
            cux cuxVar = (cux) list.get(i4);
            if (cuxVar.k()) {
                fArr[i2] = cuxVar.a();
                fArr[c5] = cuxVar.b();
                fArr[c4] = cuxVar.a();
                fArr[c6] = cuxVar.b();
                c = c6;
                f = f2;
                c2 = c4;
                c3 = c5;
                i = i2;
            } else {
                c = c6;
                f = f2;
                float fMin3 = Math.min(cuxVar.a(), cuxVar.c());
                c2 = c4;
                float fMin4 = Math.min(cuxVar.b(), cuxVar.d());
                c3 = c5;
                float fMax3 = Math.max(cuxVar.a(), cuxVar.c());
                i = i2;
                float fMax4 = Math.max(cuxVar.b(), cuxVar.d());
                fArr[i] = Math.min(fMin3, Math.min(cuxVar.e(), cuxVar.g()));
                fArr[c3] = Math.min(fMin4, Math.min(cuxVar.f(), cuxVar.h()));
                fArr[c2] = Math.max(fMax3, Math.max(cuxVar.e(), cuxVar.g()));
                fArr[c] = Math.max(fMax4, Math.max(cuxVar.f(), cuxVar.h()));
            }
            fMin = Math.min(fMin, fArr[i]);
            fMin2 = Math.min(fMin2, fArr[c3]);
            fMax = Math.max(fMax, fArr[c2]);
            fMax2 = Math.max(fMax2, fArr[c]);
            i4++;
            c6 = c;
            f2 = f;
            c4 = c2;
            c5 = c3;
            i2 = i;
        }
        float f9 = f2;
        char c7 = c5;
        int i5 = i2;
        fArr[i5] = fMin;
        fArr[c7] = fMin2;
        fArr[c4] = fMax;
        fArr[c6] = fMax2;
        float f10 = fMax - fMin;
        float f11 = fMax2 - fMin2;
        float fMax5 = Math.max(f10, f11);
        cvi cviVar = new cvi(((fMax5 - f10) / f9) - fArr[i5], fMax5, ((fMax5 - f11) / f9) - fArr[c7]);
        long j3 = cvjVarH.b;
        long jA = cviVar.a(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
        long jT = a.t(Float.intBitsToFloat((int) (jA >> 32)), Float.intBitsToFloat((int) (jA & j2)));
        ugl uglVar = new ugl((byte[]) null);
        List list2 = cvjVarH.a;
        int size = list2.size();
        while (i2 < size) {
            uglVar.add(((cvc) list2.get(i2)).a(cviVar));
            i2++;
        }
        return new cvj(ske.bi(uglVar), jT);
    }

    public static final boolean l(ajd ajdVar) {
        return ajdVar.d() || ajdVar.c();
    }

    public static final bik m(bik bikVar, dnj dnjVar, bjw bjwVar, afy afyVar) {
        return bikVar.cM(new RotaryHandlerElement(dnjVar, afyVar)).cM(new FocusRequesterElement(bjwVar)).cM(FocusTargetWithSemanticsElement.a);
    }

    public static int n(een eenVar, String str) throws edv {
        if (!eenVar.g().d()) {
            throw new edv("Language item must be used on array", 102);
        }
        for (int i = 1; i <= eenVar.a(); i++) {
            een eenVarE = eenVar.e(i);
            if (eenVarE.u() && "xml:lang".equals(eenVarE.f(1).a) && str.equals(eenVarE.f(1).b)) {
                return i;
            }
        }
        return -1;
    }

    public static een o(een eenVar, String str, boolean z) throws edv {
        if (!eenVar.g().n() && !eenVar.g().o()) {
            if (!eenVar.f) {
                throw new edv("Named children only allowed for schemas and structs", 102);
            }
            if (eenVar.g().d()) {
                throw new edv("Named children not allowed for arrays", 102);
            }
            if (z) {
                eenVar.g().x(true);
            }
        }
        een eenVarC = eenVar.c(str);
        if (eenVarC != null || !z) {
            return eenVarC;
        }
        een eenVar2 = new een(str, new eex());
        eenVar2.f = true;
        eenVar.k(eenVar2);
        return eenVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b7 A[Catch: edv -> 0x0236, TryCatch #0 {edv -> 0x0236, blocks: (B:12:0x002a, B:14:0x0030, B:16:0x0039, B:104:0x01b3, B:106:0x01b7, B:108:0x01bb, B:110:0x01c2, B:112:0x01ca, B:114:0x01d2, B:126:0x020a, B:116:0x01e2, B:118:0x01ea, B:120:0x01f3, B:122:0x01fd, B:20:0x0049, B:23:0x0057, B:28:0x006c, B:32:0x007b, B:33:0x007d, B:36:0x008e, B:38:0x0095, B:98:0x01a2, B:100:0x01a8, B:41:0x00a4, B:42:0x00ab, B:43:0x00ac, B:44:0x00b3, B:47:0x00b7, B:52:0x00c5, B:53:0x00d1, B:56:0x00d9, B:59:0x00ec, B:61:0x00f2, B:67:0x010b, B:64:0x0101, B:69:0x0112, B:70:0x011b, B:71:0x0122, B:75:0x0136, B:77:0x0148, B:79:0x0152, B:81:0x0156, B:84:0x016f, B:86:0x0175, B:87:0x017d, B:89:0x0183, B:91:0x0191, B:94:0x019a, B:127:0x0212, B:128:0x021b, B:129:0x021c, B:130:0x0223), top: B:140:0x002a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x020a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a2 A[Catch: edv -> 0x0236, TryCatch #0 {edv -> 0x0236, blocks: (B:12:0x002a, B:14:0x0030, B:16:0x0039, B:104:0x01b3, B:106:0x01b7, B:108:0x01bb, B:110:0x01c2, B:112:0x01ca, B:114:0x01d2, B:126:0x020a, B:116:0x01e2, B:118:0x01ea, B:120:0x01f3, B:122:0x01fd, B:20:0x0049, B:23:0x0057, B:28:0x006c, B:32:0x007b, B:33:0x007d, B:36:0x008e, B:38:0x0095, B:98:0x01a2, B:100:0x01a8, B:41:0x00a4, B:42:0x00ab, B:43:0x00ac, B:44:0x00b3, B:47:0x00b7, B:52:0x00c5, B:53:0x00d1, B:56:0x00d9, B:59:0x00ec, B:61:0x00f2, B:67:0x010b, B:64:0x0101, B:69:0x0112, B:70:0x011b, B:71:0x0122, B:75:0x0136, B:77:0x0148, B:79:0x0152, B:81:0x0156, B:84:0x016f, B:86:0x0175, B:87:0x017d, B:89:0x0183, B:91:0x0191, B:94:0x019a, B:127:0x0212, B:128:0x021b, B:129:0x021c, B:130:0x0223), top: B:140:0x002a, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.een p(defpackage.een r18, defpackage.eer r19, boolean r20, defpackage.eex r21) throws defpackage.edv, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.ambient.AmbientLifecycleObserverKt.p(een, eer, boolean, eex):een");
    }

    public static een q(een eenVar, String str, boolean z) {
        return r(eenVar, str, null, z);
    }

    public static een r(een eenVar, String str, String str2, boolean z) throws edv {
        een eenVarC = eenVar.c(str);
        if (eenVarC != null || !z) {
            return eenVarC;
        }
        eex eexVar = new eex();
        eexVar.f(Integer.MIN_VALUE, true);
        een eenVar2 = new een(str, eexVar);
        eenVar2.f = true;
        gga ggaVar = edy.a;
        String strA = ggaVar.a(str);
        if (strA == null) {
            if (str2 == null || str2.length() == 0) {
                throw new edv("Unregistered schema namespace URI", 101);
            }
            strA = ggaVar.c(str, str2);
        }
        eenVar2.b = strA;
        eenVar.k(eenVar2);
        return eenVar2;
    }

    public static eex s(eex eexVar, Object obj) throws edv {
        if (eexVar == null) {
            eexVar = new eex();
        }
        if (eexVar.i()) {
            eexVar.s();
        }
        if (eexVar.j()) {
            eexVar.t();
        }
        if (eexVar.k()) {
            eexVar.q();
        }
        if (eexVar.l() && obj != null && obj.toString().length() > 0) {
            throw new edv("Structs and arrays can't have values", 103);
        }
        eexVar.e(eexVar.a);
        return eexVar;
    }

    public static void t(een eenVar, String str, String str2) {
        een eenVar2 = new een("[]", str2, null);
        een eenVar3 = new een("xml:lang", str, null);
        eenVar2.m(eenVar3);
        if ("x-default".equals(eenVar3.b)) {
            eenVar.l(1, eenVar2);
        } else {
            eenVar.k(eenVar2);
        }
    }

    public static void u(een eenVar) {
        een eenVar2 = eenVar.c;
        if (eenVar.g().m()) {
            eenVar2.r(eenVar);
        } else {
            eenVar2.p(eenVar);
        }
        if (eenVar2.t() || !eenVar2.g().n()) {
            return;
        }
        eenVar2.c.p(eenVar2);
    }

    public static void v(een eenVar) {
        if (eenVar.g().i()) {
            for (int i = 2; i <= eenVar.a(); i++) {
                een eenVarE = eenVar.e(i);
                if (eenVarE.u() && "x-default".equals(eenVarE.f(1).b)) {
                    try {
                        eenVar.o(i);
                        eenVar.l(1, eenVarE);
                    } catch (edv unused) {
                    }
                    if (i == 2) {
                        eenVar.e(2).b = eenVarE.b;
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static void w(eek eekVar, een eenVar, Node node, boolean z) throws edv, DOMException {
        int iJ = J(node);
        if (iJ != 8 && iJ != 0) {
            throw new edv("Node element must be rdf:Description or typed node", 202);
        }
        if (z && iJ == 0) {
            throw new edv("Top level typed node not allowed", 203);
        }
        char c = 0;
        for (int i = 0; i < node.getAttributes().getLength(); i++) {
            Node nodeItem = node.getAttributes().item(i);
            if (!"xmlns".equals(nodeItem.getPrefix()) && (nodeItem.getPrefix() != null || !"xmlns".equals(nodeItem.getNodeName()))) {
                int iJ2 = J(nodeItem);
                if (iJ2 == 0) {
                    K(eekVar, eenVar, nodeItem, nodeItem.getNodeValue(), z);
                } else {
                    if (iJ2 != 6 && iJ2 != 2 && iJ2 != 3) {
                        throw new edv("Invalid nodeElement attribute", 202);
                    }
                    if (c > 0) {
                        throw new edv("Mutally exclusive about, ID, nodeID attributes", 202);
                    }
                    c = 1;
                    if (z && iJ2 == 3) {
                        String str = eenVar.a;
                        if (str == null || str.length() <= 0) {
                            eenVar.a = nodeItem.getNodeValue();
                        } else if (!str.equals(nodeItem.getNodeValue())) {
                            throw new edv("Mismatched top level rdf:about values", 203);
                        }
                    }
                }
            }
        }
        O(eekVar, eenVar, node, z);
    }

    public static boolean x(Node node) throws DOMException {
        if (node.getNodeType() != 3) {
            return false;
        }
        String nodeValue = node.getNodeValue();
        for (int i = 0; i < nodeValue.length(); i++) {
            if (!Character.isWhitespace(nodeValue.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void y(String str) throws edv {
        if (str.length() == 0) {
            throw new edv("Empty array name", 4);
        }
    }

    public static void z(Object obj) throws edv {
        if (obj == null) {
            throw new edv("Parameter must not be null", 4);
        }
        if ((obj instanceof String) && ((String) obj).length() == 0) {
            throw new edv("Parameter must not be null or empty", 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String D(defpackage.eee r9) {
        /*
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.text.DecimalFormat r1 = new java.text.DecimalFormat
            java.text.DecimalFormatSymbols r2 = new java.text.DecimalFormatSymbols
            java.util.Locale r3 = java.util.Locale.ENGLISH
            r2.<init>(r3)
            java.lang.String r3 = "0000"
            r1.<init>(r3, r2)
            int r2 = r9.a
            long r2 = (long) r2
            java.lang.String r2 = r1.format(r2)
            r0.append(r2)
            int r2 = r9.b
            if (r2 != 0) goto L23
            goto Lde
        L23:
            java.lang.String r2 = "'-'00"
            r1.applyPattern(r2)
            int r2 = r9.b
            long r2 = (long) r2
            java.lang.String r2 = r1.format(r2)
            r0.append(r2)
            int r2 = r9.c
            if (r2 == 0) goto Lde
            long r2 = (long) r2
            java.lang.String r2 = r1.format(r2)
            r0.append(r2)
            int r2 = r9.d
            if (r2 != 0) goto L58
            int r2 = r9.e
            if (r2 != 0) goto L58
            int r2 = r9.f
            if (r2 != 0) goto L58
            int r2 = r9.h
            if (r2 != 0) goto L58
            java.util.TimeZone r2 = r9.g
            if (r2 == 0) goto Lde
            int r2 = r2.getRawOffset()
            if (r2 == 0) goto Lde
        L58:
            r2 = 84
            r0.append(r2)
            java.lang.String r2 = "00"
            r1.applyPattern(r2)
            int r2 = r9.d
            long r2 = (long) r2
            java.lang.String r2 = r1.format(r2)
            r0.append(r2)
            r2 = 58
            r0.append(r2)
            int r2 = r9.e
            long r2 = (long) r2
            java.lang.String r2 = r1.format(r2)
            r0.append(r2)
            int r2 = r9.f
            if (r2 != 0) goto L84
            int r2 = r9.h
            if (r2 == 0) goto L9b
            r2 = 0
        L84:
            int r3 = r9.h
            double r3 = (double) r3
            java.lang.String r5 = ":00.#########"
            r1.applyPattern(r5)
            double r5 = (double) r2
            r7 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r3 = r3 / r7
            double r5 = r5 + r3
            java.lang.String r2 = r1.format(r5)
            r0.append(r2)
        L9b:
            java.util.TimeZone r2 = r9.g
            if (r2 == 0) goto Lde
            java.util.Calendar r2 = r9.a()
            long r2 = r2.getTimeInMillis()
            java.util.TimeZone r9 = r9.g
            int r9 = r9.getOffset(r2)
            if (r9 != 0) goto Lb5
            r9 = 90
            r0.append(r9)
            goto Lde
        Lb5:
            r2 = 3600000(0x36ee80, float:5.044674E-39)
            int r3 = r9 / r2
            int r9 = r9 % r2
            r2 = 60000(0xea60, float:8.4078E-41)
            int r9 = r9 / r2
            int r9 = java.lang.Math.abs(r9)
            java.lang.String r2 = "+00;-00"
            r1.applyPattern(r2)
            long r2 = (long) r3
            java.lang.String r2 = r1.format(r2)
            r0.append(r2)
            r2 = 0
            java.lang.String r2 = com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS.ZWbBFagKNf
            r1.applyPattern(r2)
            long r2 = (long) r9
            java.lang.String r9 = r1.format(r2)
            r0.append(r9)
        Lde:
            java.lang.String r9 = r0.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.ambient.AmbientLifecycleObserverKt.D(eee):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void M(defpackage.eek r16, defpackage.een r17, org.w3c.dom.Node r18, boolean r19) throws defpackage.edv {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.ambient.AmbientLifecycleObserverKt.M(eek, een, org.w3c.dom.Node, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void O(defpackage.eek r17, defpackage.een r18, org.w3c.dom.Node r19, boolean r20) throws defpackage.edv, org.w3c.dom.DOMException {
        /*
            Method dump skipped, instructions count: 930
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.wear.ambient.AmbientLifecycleObserverKt.O(eek, een, org.w3c.dom.Node, boolean):void");
    }

    public static void A(String str) throws edv {
        if (str.length() != 0) {
        } else {
            throw new edv(INRGuObcrHjSQz.gDAhFssAcqAyRG, 4);
        }
    }

    public static final AmbientLifecycleObserver AmbientLifecycleObserver(Activity activity, Executor executor, AmbientLifecycleObserver.AmbientLifecycleCallback ambientLifecycleCallback) {
        activity.getClass();
        executor.getClass();
        ambientLifecycleCallback.getClass();
        return new AmbientLifecycleObserverImpl(activity, executor, ambientLifecycleCallback);
    }
}
