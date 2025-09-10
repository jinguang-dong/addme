package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLSync;
import android.util.Base64;
import android.util.Log;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;
import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;
import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import com.google.android.build.data.JKx.wzgaYJqO;
import com.google.ar.core.R;
import com.google.common.io.ByteStreams;
import j$.nio.channels.DesugarChannels;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qsp {
    public static volatile long b;

    public qsp() {
    }

    public static String A(String str, rwc rwcVar) {
        return (rwcVar == null || !rwcVar.h()) ? str : str.concat((String) rwcVar.c());
    }

    public static String B(tqr tqrVar) {
        return Base64.encodeToString(tqrVar.h(), 3);
    }

    public static void C(SharedPreferences.Editor editor, String str) {
        editor.remove(str);
    }

    public static void D(SharedPreferences.Editor editor, String str, tqr tqrVar) {
        editor.putString(str, B(tqrVar));
    }

    public static boolean E(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.edit().remove(str).commit();
    }

    public static boolean F(SharedPreferences sharedPreferences, String str, tqr tqrVar) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        D(editorEdit, str, tqrVar);
        return editorEdit.commit();
    }

    public static pvp G(String str, Context context, pwt pwtVar) throws qcv {
        tpc tpcVarM;
        List listF = rwr.c("|").f(str);
        int iOrdinal = prh.j(context, pwtVar).ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (listF.size() != 4) {
                    throw new qcv("Bad-format serializedFileKey = ".concat(String.valueOf(str)));
                }
                tpcVarM = pvp.a.m();
                String str2 = (String) listF.get(0);
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                pvp pvpVar = (pvp) tpcVarM.b;
                str2.getClass();
                pvpVar.b |= 1;
                pvpVar.c = str2;
                long j = Integer.parseInt((String) listF.get(1));
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                pvp pvpVar2 = (pvp) tpcVarM.b;
                pvpVar2.b |= 2;
                pvpVar2.d = j;
                String str3 = (String) listF.get(2);
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                pvp pvpVar3 = (pvp) tpcVarM.b;
                str3.getClass();
                pvpVar3.b |= 4;
                pvpVar3.e = str3;
                int iAx = a.ax(Integer.parseInt((String) listF.get(3)));
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                pvp pvpVar4 = (pvp) tpcVarM.b;
                int i = iAx - 1;
                if (iAx == 0) {
                    throw null;
                }
                pvpVar4.f = i;
                pvpVar4.b |= 8;
            } else {
                if (listF.size() != 2) {
                    throw new qcv("Bad-format serializedFileKey = s".concat(String.valueOf(str)));
                }
                tpcVarM = pvp.a.m();
                String str4 = (String) listF.get(0);
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                pvp pvpVar5 = (pvp) tpcVarM.b;
                str4.getClass();
                pvpVar5.b |= 4;
                pvpVar5.e = str4;
                int iAx2 = a.ax(Integer.parseInt((String) listF.get(1)));
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                pvp pvpVar6 = (pvp) tpcVarM.b;
                int i2 = iAx2 - 1;
                if (iAx2 == 0) {
                    throw null;
                }
                pvpVar6.f = i2;
                pvpVar6.b |= 8;
            }
        } else {
            if (listF.size() != 5) {
                throw new qcv("Bad-format serializedFileKey = ".concat(String.valueOf(str)));
            }
            tpc tpcVarM2 = pvp.a.m();
            String str5 = (String) listF.get(0);
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            pvp pvpVar7 = (pvp) tpcVarM2.b;
            str5.getClass();
            pvpVar7.b |= 1;
            pvpVar7.c = str5;
            long j2 = Integer.parseInt((String) listF.get(1));
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            pvp pvpVar8 = (pvp) tpcVarM2.b;
            pvpVar8.b |= 2;
            pvpVar8.d = j2;
            String str6 = (String) listF.get(2);
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            pvp pvpVar9 = (pvp) tpcVarM2.b;
            str6.getClass();
            pvpVar9.b |= 4;
            pvpVar9.e = str6;
            int iAx3 = a.ax(Integer.parseInt((String) listF.get(3)));
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            pvp pvpVar10 = (pvp) tpcVarM2.b;
            int i3 = iAx3 - 1;
            if (iAx3 == 0) {
                throw null;
            }
            pvpVar10.f = i3;
            pvpVar10.b |= 8;
            if (listF.get(4) != null && !((String) listF.get(4)).isEmpty()) {
                try {
                    tvy tvyVar = (tvy) y((String) listF.get(4), (tqy) tvy.a.a(7, null));
                    if (!tpcVarM2.b.C()) {
                        tpcVarM2.o();
                    }
                    pvp pvpVar11 = (pvp) tpcVarM2.b;
                    tvyVar.getClass();
                    pvpVar11.g = tvyVar;
                    pvpVar11.b |= 16;
                } catch (tpz e) {
                    throw new qcv("Failed to deserialize key:".concat(String.valueOf(str)), e);
                }
            }
            tpcVarM = tpcVarM2;
        }
        return (pvp) tpcVarM.l();
    }

    public static String H(pvp pvpVar, Context context, pwt pwtVar) {
        int iOrdinal = prh.j(context, pwtVar).ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? I(pvpVar) : J(pvpVar) : K(pvpVar) : I(pvpVar);
    }

    public static String I(pvp pvpVar) {
        StringBuilder sb = new StringBuilder(pvpVar.c);
        sb.append("|");
        sb.append(pvpVar.d);
        sb.append("|");
        sb.append(pvpVar.e);
        sb.append("|");
        int iAx = a.ax(pvpVar.f);
        if (iAx == 0) {
            iAx = 1;
        }
        sb.append(iAx - 1);
        return sb.toString();
    }

    public static String J(pvp pvpVar) {
        StringBuilder sb = new StringBuilder(pvpVar.e);
        sb.append("|");
        int iAx = a.ax(pvpVar.f);
        if (iAx == 0) {
            iAx = 1;
        }
        sb.append(iAx - 1);
        return sb.toString();
    }

    public static String K(pvp pvpVar) {
        String strB;
        StringBuilder sb = new StringBuilder(pvpVar.c);
        sb.append("|");
        sb.append(pvpVar.d);
        sb.append("|");
        sb.append(pvpVar.e);
        sb.append("|");
        int iAx = a.ax(pvpVar.f);
        if (iAx == 0) {
            iAx = 1;
        }
        sb.append(iAx - 1);
        sb.append("|");
        if ((pvpVar.b & 16) != 0) {
            tvy tvyVar = pvpVar.g;
            if (tvyVar == null) {
                tvyVar = tvy.a;
            }
            strB = B(tvyVar);
        } else {
            strB = "";
        }
        sb.append(strB);
        return sb.toString();
    }

    public static List M(ByteBuffer byteBuffer, Class cls, tqy tqyVar) {
        Object objE;
        String string = cls.toString();
        int iLimit = byteBuffer.limit();
        ArrayList arrayList = new ArrayList((byteBuffer.limit() / 1000) + 1);
        while (byteBuffer.position() < iLimit) {
            try {
                int i = byteBuffer.getInt();
                if (i < 0) {
                    Log.e("ProtoLiteUtil", String.format("Invalid message size: %d. May have given the wrong message type: %s", Integer.valueOf(i), string));
                    return null;
                }
                if (iLimit < byteBuffer.position() + i + 8) {
                    Log.e("ProtoLiteUtil", String.format("Invalid message size: %d (buffer end is %d)", Integer.valueOf(i), Integer.valueOf(iLimit)));
                    return arrayList;
                }
                long j = byteBuffer.getLong(byteBuffer.position() + i);
                byte[] bArrArray = byteBuffer.array();
                int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                CRC32 crc32 = new CRC32();
                crc32.update(bArrArray, iArrayOffset, i);
                long value = crc32.getValue();
                if (value != j) {
                    Log.e("ProtoLiteUtil", String.format("Corrupt protobuf data, expected CRC: %d computed CRC: %d", Long.valueOf(j), Long.valueOf(value)));
                    return arrayList;
                }
                byte[] bArrArray2 = byteBuffer.array();
                int iArrayOffset2 = byteBuffer.arrayOffset() + byteBuffer.position();
                try {
                    tow towVar = tow.a;
                    tra traVar = tra.a;
                    objE = tqyVar.e(bArrArray2, iArrayOffset2, i, tow.a);
                } catch (tpz e) {
                    Log.e("ProtoLiteUtil", "Cannot deserialize message of type ".concat(cls.toString()), e);
                    objE = null;
                }
                if (objE == null) {
                    return null;
                }
                arrayList.add(objE);
                byteBuffer.position(byteBuffer.position() + i + 8);
            } catch (BufferUnderflowException e2) {
                Log.e("ProtoLiteUtil", String.format("Buffer underflow. May have given the wrong message type: %s", string), e2);
                return null;
            }
        }
        return arrayList;
    }

    public static qaq N(Iterable iterable) {
        return new qaq(ske.E(iterable));
    }

    @SafeVarargs
    public static qaq O(syu... syuVarArr) {
        return new qaq(ske.F(syuVarArr));
    }

    public static qaq P(Iterable iterable) {
        return new qaq(ske.G(iterable));
    }

    @SafeVarargs
    public static qaq Q(syu... syuVarArr) {
        return new qaq(ske.H(syuVarArr));
    }

    public static pud R(pvc pvcVar) {
        byte[] bArrH = pvcVar.h();
        tow towVar = tow.a;
        tra traVar = tra.a;
        tph tphVarQ = tph.q(pud.a, bArrH, 0, bArrH.length, tow.a);
        tph.D(tphVarQ);
        pud pudVar = (pud) tphVarQ;
        Stream map = Collection.EL.stream(pvcVar.o).map(new npd(pudVar, 3));
        int i = sbp.d;
        sbp sbpVar = (sbp) map.collect(ryv.a);
        tpc tpcVar = (tpc) pudVar.a(5, null);
        tpcVar.r(pudVar);
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        ((pud) tpcVar.b).f = trb.a;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        pud pudVar2 = (pud) tpcVar.b;
        pudVar2.b();
        tnq.e(sbpVar, pudVar2.f);
        return (pud) tpcVar.l();
    }

    public static reh S(Context context, syw sywVar, qbq qbqVar, qaq qaqVar, rwc rwcVar) {
        ref refVarA = reh.a(context, sywVar);
        refVarA.c = A("gms_icing_mdd_groups", rwcVar);
        refVarA.b();
        refVarA.d = new nxi(qaqVar, 6);
        refVarA.c(new qcu(qbqVar, 1));
        return refVarA.a();
    }

    public static reh T(Context context, syw sywVar, qbq qbqVar, qaq qaqVar, rwc rwcVar) {
        ref refVarA = reh.a(context, sywVar);
        refVarA.c = A("gms_icing_mdd_shared_files", rwcVar);
        refVarA.b();
        refVarA.d = new nxi(qaqVar, 6);
        refVarA.c(new qcu(qbqVar, 0));
        return refVarA.a();
    }

    public static pvl U(String str) throws qct {
        try {
            return (pvl) y(str, (tqy) pvl.a.a(7, null));
        } catch (NullPointerException | tpz e) {
            throw new qct("Failed to deserialize key:".concat(String.valueOf(str)), e);
        }
    }

    public static File V(Context context, rwc rwcVar) {
        String strConcat = "gms_icing_mdd_garbage_file";
        if (rwcVar != null && rwcVar.h()) {
            strConcat = "gms_icing_mdd_garbage_file".concat((String) rwcVar.c());
        }
        return new File(context.getFilesDir(), strConcat);
    }

    public static String W(pvl pvlVar) {
        return Base64.encodeToString(pvlVar.h(), 3);
    }

    public static long X(pvc pvcVar) {
        if (pvcVar.l == 0) {
            return Long.MAX_VALUE;
        }
        return TimeUnit.SECONDS.toMillis(pvcVar.l);
    }

    public static Uri Y(Uri uri, pva pvaVar) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (pvaVar.p.isEmpty()) {
            String str = pvaVar.d;
            builderBuildUpon.appendPath(str.substring(str.lastIndexOf("/") + 1));
        } else {
            for (String str2 : pvaVar.p.split("/", -1)) {
                if (!str2.isEmpty()) {
                    builderBuildUpon.appendPath(str2);
                }
            }
        }
        return builderBuildUpon.build();
    }

    public static Uri Z(Context context, rwc rwcVar, pvc pvcVar) {
        String str = !pvcVar.w.isEmpty() ? pvcVar.w : pvcVar.d;
        int iAx = a.ax(pvcVar.j);
        if (iAx == 0) {
            iAx = 1;
        }
        return aj(context, rwcVar).buildUpon().appendPath(an(iAx)).build().buildUpon().appendPath(str).build();
    }

    public static uyp a(uyp uypVar, long j) {
        tpc tpcVar = (tpc) uypVar.a(5, null);
        tpcVar.r(uypVar);
        tph tphVar = tpcVar.b;
        uyp uypVar2 = (uyp) tphVar;
        if ((uypVar2.b & 2) != 0) {
            long j2 = uypVar2.d - j;
            if (!tphVar.C()) {
                tpcVar.o();
            }
            uyp uypVar3 = (uyp) tpcVar.b;
            uypVar3.b |= 2;
            uypVar3.d = j2;
        }
        tph tphVar2 = tpcVar.b;
        uyp uypVar4 = (uyp) tphVar2;
        if ((uypVar4.b & 4) != 0) {
            long j3 = uypVar4.e - j;
            if (!tphVar2.C()) {
                tpcVar.o();
            }
            uyp uypVar5 = (uyp) tpcVar.b;
            uypVar5.b |= 4;
            uypVar5.e = j3;
        }
        tph tphVar3 = tpcVar.b;
        uyp uypVar6 = (uyp) tphVar3;
        if ((uypVar6.b & 8) != 0) {
            long j4 = uypVar6.f - j;
            if (!tphVar3.C()) {
                tpcVar.o();
            }
            uyp uypVar7 = (uyp) tpcVar.b;
            uypVar7.b |= 8;
            uypVar7.f = j4;
        }
        return (uyp) tpcVar.l();
    }

    public static pvc aa(pvc pvcVar, long j) {
        pvb pvbVar = pvcVar.c;
        if (pvbVar == null) {
            pvbVar = pvb.a;
        }
        tpc tpcVar = (tpc) pvbVar.a(5, null);
        tpcVar.r(pvbVar);
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        pvb pvbVar2 = (pvb) tpcVar.b;
        pvbVar2.b |= 1;
        pvbVar2.c = j;
        pvb pvbVar3 = (pvb) tpcVar.l();
        tpc tpcVar2 = (tpc) pvcVar.a(5, null);
        tpcVar2.r(pvcVar);
        if (!tpcVar2.b.C()) {
            tpcVar2.o();
        }
        pvc pvcVar2 = (pvc) tpcVar2.b;
        pvbVar3.getClass();
        pvcVar2.c = pvbVar3;
        pvcVar2.b |= 1;
        return (pvc) tpcVar2.l();
    }

    public static String ab(pva pvaVar) {
        return ac(pvaVar) ? pvaVar.i : pvaVar.g;
    }

    public static boolean ac(pva pvaVar) {
        if ((pvaVar.b & 32) == 0) {
            return false;
        }
        tvy tvyVar = pvaVar.h;
        if (tvyVar == null) {
            tvyVar = tvy.a;
        }
        Iterator it = tvyVar.b.iterator();
        while (it.hasNext()) {
            if (((tvx) it.next()).b == 4) {
                return true;
            }
        }
        return false;
    }

    public static boolean ad(String str, scn scnVar) {
        if (str.isEmpty()) {
            return false;
        }
        int iIndexOf = str.indexOf(58);
        rnt.O(iIndexOf >= 0, "Invalid url: %s", str);
        String strSubstring = str.substring(0, iIndexOf);
        sgj sgjVarListIterator = scnVar.listIterator();
        while (sgjVarListIterator.hasNext()) {
            if (rup.e(strSubstring, (String) sgjVarListIterator.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean ae(pva pvaVar) {
        return ad(pvaVar.d, new sfm("inlinefile"));
    }

    public static boolean af(pvc pvcVar) {
        if (!pvcVar.n) {
            return false;
        }
        Iterator it = pvcVar.o.iterator();
        while (it.hasNext()) {
            int iAq = a.aq(((pva) it.next()).m);
            if (iAq != 0 && iAq == 2) {
                return false;
            }
        }
        return true;
    }

    public static boolean ag(pva pvaVar) {
        return ad(pvaVar.d, scn.H("file", "asset"));
    }

    public static boolean ah(long j) {
        return j <= prh.q();
    }

    public static Uri aj(Context context, rwc rwcVar) {
        return ai(context, rwcVar).buildUpon().appendPath("links").build();
    }

    public static Uri ak(Context context, String str) {
        int i = rcp.a;
        return g(str, context.getPackageName(), 0L);
    }

    public static String al(String str, rwc rwcVar) {
        if (rwcVar != null && rwcVar.h()) {
            str = str.concat((String) rwcVar.c());
        }
        return str.concat(".pb");
    }

    public static Uri am(Context context, int i, String str, String str2, pwt pwtVar, rwc rwcVar, boolean z) {
        try {
            if (z) {
                return ak(context, str2);
            }
            return ai(context, rwcVar).buildUpon().appendPath(an(i)).build().buildUpon().appendPath(str).build();
        } catch (Exception e) {
            qbu.g(e, "%s: Unable to create mobstore uri for file %s.", "DirectoryUtil", str);
            pwtVar.a();
            return null;
        }
    }

    public static String an(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? "public_3p" : "private" : "public";
    }

    public static Uri ao(Uri uri) {
        String string = uri.toString();
        return Uri.parse(string.substring(0, string.lastIndexOf("_")));
    }

    public static String ap(String str, String str2) {
        return str + "_" + str2;
    }

    public static qbj aq(qav qavVar, tzx tzxVar, tzx tzxVar2, tzx tzxVar3) {
        pzc pzcVar = (pzc) tzxVar3.a();
        Object obj = qavVar.j;
        obj.getClass();
        Executor executor = (Executor) tzxVar2.a();
        puu puuVar = (puu) tzxVar.a();
        rwc rwcVar = (rwc) obj;
        if (!rwcVar.h()) {
            return new qbk();
        }
        pup pupVar = (pup) rwcVar.c();
        Object obj2 = qavVar.d;
        return new qbo(puuVar, pupVar, pzcVar, executor);
    }

    public static qag ar(qaq qaqVar, qav qavVar, tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, tzx tzxVar13) {
        Context contextC = jdg.c(qaqVar);
        pwt pwtVar = (pwt) tzxVar2.a();
        qai qaiVar = (qai) tzxVar7.a();
        lat latVar = (lat) tzxVar5.a();
        qbh qbhVar = new qbh(jdg.c(qaqVar), (rww) tzxVar8.a(), (lat) tzxVar5.a(), (qdf) tzxVar9.a(), (rwc) tzxVar10.a(), (qbv) tzxVar11.a(), (Executor) tzxVar6.a(), (puu) tzxVar4.a());
        rwc rwcVar = (rwc) tzxVar12.a();
        rwc rwcVar2 = (rwc) tzxVar10.a();
        qbq qbqVar = (qbq) tzxVar.a();
        puu puuVar = (puu) tzxVar4.a();
        pzc pzcVar = (pzc) tzxVar13.a();
        rwc rwcVar3 = (rwc) tzxVar3.a();
        Executor executor = (Executor) tzxVar6.a();
        Object obj = qavVar.k;
        return new qag(contextC, pwtVar, qaiVar, latVar, qbhVar, rwcVar, rwcVar2, qbqVar, puuVar, pzcVar, rwcVar3, executor);
    }

    public static pzb as(qaq qaqVar, qav qavVar, tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5, tzx tzxVar6, tzx tzxVar7, tzx tzxVar8, tzx tzxVar9, tzx tzxVar10, tzx tzxVar11, tzx tzxVar12, tzx tzxVar13, tzx tzxVar14, tzx tzxVar15, tzx tzxVar16, tzx tzxVar17) {
        return new pzb(jdg.c(qaqVar), (qbq) tzxVar.a(), (pwt) tzxVar2.a(), (pzc) tzxVar14.a(), ar(qaqVar, qavVar, tzxVar, tzxVar2, tzxVar3, tzxVar4, tzxVar5, tzxVar6, tzxVar7, tzxVar8, tzxVar9, tzxVar10, tzxVar12, tzxVar13, tzxVar14), (prh) tzxVar11.a(), (rwc) tzxVar15.a(), (Executor) tzxVar6.a(), (rwc) tzxVar3.a(), (lat) tzxVar5.a(), (rwc) tzxVar16.a(), aq(qavVar, tzxVar4, tzxVar6, tzxVar14), (puu) tzxVar4.a(), (Executor) tzxVar17.a());
    }

    public static pvp at(pva pvaVar, int i) {
        tpc tpcVarM = pvp.a.m();
        String str = pvaVar.d;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        pvp pvpVar = (pvp) tphVar;
        str.getClass();
        pvpVar.b |= 1;
        pvpVar.c = str;
        long j = pvaVar.e;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        pvp pvpVar2 = (pvp) tpcVarM.b;
        pvpVar2.b |= 2;
        pvpVar2.d = j;
        String strAb = ab(pvaVar);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        pvp pvpVar3 = (pvp) tphVar2;
        strAb.getClass();
        pvpVar3.b |= 4;
        pvpVar3.e = strAb;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        pvp pvpVar4 = (pvp) tpcVarM.b;
        pvpVar4.f = i - 1;
        pvpVar4.b |= 8;
        if ((pvaVar.b & 32) != 0) {
            tvy tvyVar = pvaVar.h;
            if (tvyVar == null) {
                tvyVar = tvy.a;
            }
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            pvp pvpVar5 = (pvp) tpcVarM.b;
            tvyVar.getClass();
            pvpVar5.g = tvyVar;
            pvpVar5.b |= 16;
        }
        return (pvp) tpcVarM.l();
    }

    public static void au(Context context, rwc rwcVar, pvc pvcVar, lat latVar) {
        Uri uriZ = Z(context, rwcVar, pvcVar);
        if (latVar.r(uriZ)) {
            rdo rdoVar = new rdo();
            rdoVar.a = true;
        }
    }

    public static void av(AmbientModeSupport.AmbientController ambientController, edw edwVar, edw edwVar2, qdy qdyVar, OutputStream outputStream) throws IOException {
        pqw.o((byte[]) ambientController.a, outputStream, edwVar, edwVar2);
        try {
            long jCopy = ByteStreams.copy(qdyVar.b, outputStream);
            int i = qdyVar.a;
            if (jCopy != i) {
                throw new IllegalStateException(String.format(Locale.US, "Bundled input stream claimed length of %d but had %d", Integer.valueOf(i), Long.valueOf(jCopy)));
            }
            qdyVar.b.close();
            outputStream.flush();
        } catch (Throwable th) {
            qdyVar.b.close();
            throw th;
        }
    }

    private static Object aw(qeb... qebVarArr) {
        for (qeb qebVar : qebVarArr) {
            Object objA = qebVar.a();
            if (objA != null) {
                return objA;
            }
        }
        return null;
    }

    private static String ax(raq raqVar) {
        String str;
        if (raqVar.b.contentEquals("Primary")) {
            str = "";
        } else {
            Log.w("MVXmpMetadata", "Badly formatted file. First container item is not primary");
            str = "First container item must be primary.\n";
        }
        int i = raqVar.c;
        if (i <= 0) {
            return str;
        }
        String strConcat = str.concat("First container item must have length of 0.\n");
        Log.w("MVXmpMetadata", a.bv(i, "First container length expected to be 0. Found: "));
        return strConcat;
    }

    private static String ay(raq raqVar) {
        String str;
        if (raqVar.b.contentEquals("Primary")) {
            Log.w("MVXmpMetadata", "Badly formatted file. Only first container item should be primary");
            str = "Secondary container items must not be primary.\n";
        } else {
            str = "";
        }
        if (raqVar.d <= 0) {
            return str;
        }
        String strConcat = str.concat("Secondary container items must have 0 padding.\n");
        Log.w("MVXmpMetadata", "Badly formatted file. Only primary container items may have padding.");
        return strConcat;
    }

    private static void az(BufferOverflowException bufferOverflowException) {
        Log.e("ProtoLiteUtil", "Buffer underflow. A message may have an invalid serialized form or has been concurrently modified.", bufferOverflowException);
    }

    public static File b(rds rdsVar, Uri uri) throws rcw {
        throw new rcw("Cannot convert uri to file " + rdsVar.f() + " " + String.valueOf(uri));
    }

    public static Iterable c(rds rdsVar) throws rcw {
        throw new rcw("children not supported by ".concat(rdsVar.f()));
    }

    public static void d(rds rdsVar) throws rcw {
        throw new rcw("createDirectory not supported by ".concat(rdsVar.f()));
    }

    public static void e(rds rdsVar) throws rcw {
        throw new rcw("deleteDirectory not supported by ".concat(rdsVar.f()));
    }

    public static void f(rds rdsVar) throws rcw {
        throw new rcw("rename not supported by ".concat(rdsVar.f()));
    }

    public static Uri g(String str, String str2, long j) {
        Uri.Builder builderPath = new Uri.Builder().scheme("blobstore").authority(str2).path(str);
        if (rcp.c(str) && !rcp.b(str)) {
            builderPath.appendQueryParameter("expiryDateSecs", String.valueOf(j));
        }
        Uri uriBuild = builderPath.build();
        rcp.a(uriBuild);
        return uriBuild;
    }

    public static String h(Context context, String str, long j, int i) throws Resources.NotFoundException, IOException {
        Resources resources = context.getApplicationContext().getResources();
        InputStream inputStreamOpenRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(R.id.dummy_placeholder)));
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStreamOpenRawResource.skip(j);
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            while (i > 0) {
                int i2 = inputStreamOpenRawResource.read(bArr, 0, Math.min(i, 1024));
                if (i2 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
                i -= i2;
            }
            inputStreamOpenRawResource.close();
            try {
                return byteArrayOutputStream.toString("UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unsupported encoding UTF8. This should always be supported.", e);
            }
        } catch (IOException e2) {
            throw new RuntimeException("Failed to read license or metadata text.", e2);
        }
    }

    public static void i(String str, MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        if (mediaFormat.containsKey(str)) {
            mediaFormat2.setInteger(str, mediaFormat.getInteger(str));
        }
    }

    public static qjq j(EGLSync eGLSync) {
        return new qjo(EGL14.eglGetDisplay(0), eGLSync);
    }

    public static qfp k(int i) {
        return new qfp(new ArrayList(i));
    }

    public static qeq l(qer qerVar) throws IOException, qeo {
        if (qerVar.a() < 8) {
            throw new qeo(String.format(Locale.US, "Box too small: remaining=%s", Long.valueOf(qerVar.a())));
        }
        long j = qerVar.d;
        FileInputStream fileInputStream = qerVar.a;
        long j2 = qerVar.b;
        o(fileInputStream).position(j + j2);
        long jA = new DataInputStream(fileInputStream).readInt() & 4294967295L;
        if (jA != 1) {
            if (jA == 0) {
                jA = qerVar.a();
            }
            return new qeq(jA, false);
        }
        if (qerVar.a() < 16) {
            throw new qeo(String.format(Locale.US, "64-bit box too small just %s bytes remaining", Long.valueOf(qerVar.a())));
        }
        o(fileInputStream).position(j2 + qerVar.d + 8);
        long j3 = new DataInputStream(fileInputStream).readLong();
        if (j3 >= 0) {
            return new qeq(j3, true);
        }
        throw new qeo(String.format(Locale.US, "64-bit box size too large: 0x%x", Long.valueOf(j3)));
    }

    public static qer m(qer qerVar) throws qes {
        if (qerVar.a() == 0) {
            return null;
        }
        long j = l(qerVar).a;
        if (j > qerVar.a()) {
            throw new qes(j, qerVar.a());
        }
        qer qerVarB = qerVar.b();
        qerVarB.d(qerVarB.d + j);
        qerVar.e(qerVar.d + j);
        return qerVarB.c();
    }

    public static byte[] n(qer qerVar) throws IOException, qeo {
        if (qerVar.a() < 8) {
            throw new qeo(String.format(Locale.US, "Can't get type of short (%d bytes) box", Long.valueOf(qerVar.a())));
        }
        a.I(qerVar.a() >= 8);
        qer qerVarB = qerVar.b();
        qerVarB.e(qerVar.d + 4);
        qerVarB.d(qerVarB.d + 4);
        qer qerVarC = qerVarB.c();
        FileInputStream fileInputStream = qerVarC.a;
        o(fileInputStream).position(qerVarC.b + qerVarC.d);
        if (qerVarC.a() >= 2147483647L) {
            throw new IOException("Can't read contents of a >2GB span");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) qerVarC.a());
        int i = o(fileInputStream).read(byteBufferAllocate);
        if (i == qerVarC.a()) {
            byteBufferAllocate.rewind();
            byte[] bArr = new byte[4];
            byteBufferAllocate.get(bArr);
            return bArr;
        }
        throw new IOException("Was supposed to have " + qerVarC.a() + " bytes remaining but only read " + i);
    }

    public static /* synthetic */ FileChannel o(FileInputStream fileInputStream) {
        return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
    }

    public static int q(edw edwVar) {
        return ((Integer) aw(new qea(edwVar, 0), new qea(edwVar, 2), new qdz(1))).intValue();
    }

    public static int r(edw edwVar) throws edv {
        boolean z = true;
        if (q(edwVar) == 1) {
            return ((Integer) aw(new qea(edwVar, 1), new qdz(0))).intValue();
        }
        if (q(edwVar) == 1) {
            throw new edv("V1 format does not have a container", 5);
        }
        rar rarVar = new rar(1);
        int iH = edwVar.h();
        for (int i = 1; i <= iH; i++) {
            String strF = AmbientLifecycleObserverKt.F("Directory", i);
            String strC = raq.c(edwVar, strF, "Mime");
            raq.d(strC, "Mime");
            String strC2 = raq.c(edwVar, strF, "Semantic");
            raq.d(strC2, "Semantic");
            Object objB = raq.b(raq.c(edwVar, strF, "Length"));
            Object objB2 = raq.b(raq.c(edwVar, strF, "Padding"));
            rap rapVar = new rap();
            rapVar.a = strC;
            rapVar.b = strC2;
            rapVar.b(Integer.parseInt((String) objB));
            rapVar.c(Integer.parseInt((String) objB2));
            rarVar.b(rapVar.a());
        }
        int i2 = 0;
        for (raq raqVar : rarVar.a()) {
            if (z) {
                ax(raqVar);
                i2 += raqVar.d;
                z = false;
            } else {
                ay(raqVar);
                i2 += raqVar.c + raqVar.d;
            }
        }
        return i2;
    }

    public static Object s(String str) throws edv {
        throw new edv("Property value missing for ".concat(str), 5);
    }

    public static boolean t(edw edwVar) {
        return edwVar.e("http://ns.google.com/photos/1.0/container/", "Directory");
    }

    public static boolean v(String str) {
        return str.startsWith("video/");
    }

    public static int w(int i) {
        if (i == 0) {
            return 1;
        }
        switch (i) {
            case 950:
                return 951;
            case 951:
                return 952;
            case 952:
                return 953;
            default:
                switch (i) {
                    case 1001:
                        return 1002;
                    case 1002:
                        return 1003;
                    case 1003:
                        return 1004;
                    case 1004:
                        return 1005;
                    case 1005:
                        return 1006;
                    default:
                        return 0;
                }
        }
    }

    public static SharedPreferences x(Context context, String str, rwc rwcVar) {
        return context.getSharedPreferences(A(str, rwcVar), 0);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, tqr] */
    public static tqr y(String str, tqy tqyVar) throws tpz {
        try {
            byte[] bArrDecode = Base64.decode(str, 3);
            tow towVar = tow.a;
            tra traVar = tra.a;
            return tqyVar.d(bArrDecode, tow.a);
        } catch (IllegalArgumentException e) {
            throw new tpz("Unable to decode to byte array", new IOException(e));
        }
    }

    public static tqr z(SharedPreferences sharedPreferences, String str, tqy tqyVar) {
        String string = sharedPreferences.getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return y(string, tqyVar);
        } catch (tpz unused) {
            return null;
        }
    }

    public qsp(byte[] bArr) {
    }

    public static ByteBuffer L(Iterable iterable) {
        long jL = 0;
        int i = 0;
        int i2 = 0;
        while (iterable.iterator().hasNext()) {
            jL += ((tqr) r1.next()).l() + 12;
            i2++;
        }
        if (i2 == 0) {
            return ByteBuffer.allocate(0);
        }
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) jL);
            byte[] bArrArray = byteBufferAllocate.array();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                tqr tqrVar = (tqr) it.next();
                int iL = tqrVar.l();
                try {
                    byteBufferAllocate.putInt(iL);
                    int i3 = i + 4;
                    try {
                        boolean z = tos.e;
                        tqrVar.eg(new toq(bArrArray, i3, iL));
                    } catch (IOException e) {
                        Log.e("ProtoLiteUtil", CZAHo.RrbYNuPUa, e);
                    }
                    try {
                        byteBufferAllocate.put(bArrArray, i3, iL);
                        int i4 = i3 + iL;
                        CRC32 crc32 = new CRC32();
                        crc32.update(bArrArray, i4 - iL, iL);
                        byteBufferAllocate.putLong(crc32.getValue());
                        i = i4 + 8;
                    } catch (BufferOverflowException e2) {
                        az(e2);
                        return null;
                    }
                } catch (BufferOverflowException e3) {
                    az(e3);
                    return null;
                }
            }
            byteBufferAllocate.rewind();
            return byteBufferAllocate;
        } catch (IllegalArgumentException e4) {
            Log.e("ProtoLiteUtil", String.format("Too big to serialize, %s", jL > 1073741824 ? String.format(Locale.US, "%.2fGB", Double.valueOf(jL / 1.073741824E9d)) : jL > 1048576 ? String.format(Locale.US, "%.2fMB", Double.valueOf(jL / 1048576.0d)) : jL > 1024 ? String.format(Locale.US, "%.2fKB", Double.valueOf(jL / 1024.0d)) : String.format(Locale.US, "%d Bytes", Long.valueOf(jL))), e4);
            return null;
        }
    }

    public static Uri ai(Context context, rwc rwcVar) {
        Pattern pattern = rcl.a;
        rck rckVar = new rck(context);
        String str = wzgaYJqO.fxCigzDFxyMFRLg;
        rckVar.d((rwcVar == null || !rwcVar.h()) ? str : (String) rwcVar.c());
        if (rwcVar != null && rwcVar.h()) {
            rckVar.e(str);
        }
        return rckVar.a();
    }

    public qsp(int[] iArr) {
        Executors.newSingleThreadScheduledExecutor();
        new qfe();
        new qfe();
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    public static void u(edw edwVar, long j, raq... raqVarArr) throws edv {
        int iH;
        String strAy;
        if (t(edwVar)) {
            iH = edwVar.h() + 1;
        } else {
            iH = 1;
        }
        int i = 0;
        while (true) {
            if (i < raqVarArr.length) {
                if (i == 0 && iH == 1) {
                    strAy = ax(raqVarArr[0]);
                } else {
                    strAy = ay(raqVarArr[i]);
                }
                if (strAy.isEmpty()) {
                    i++;
                } else {
                    throw new edv("Container items have bad values: ".concat(strAy), 5);
                }
            } else {
                rar rarVar = new rar(iH);
                for (raq raqVar : raqVarArr) {
                    rarVar.b(raqVar);
                }
                boolean z = rarVar.b;
                if (!z) {
                    edy.a.c("http://ns.google.com/photos/1.0/camera/", "Camera");
                }
                edwVar.c("http://ns.google.com/photos/1.0/camera/", mPfBwqXsnpXI.oHLxKIHkdtuBL, 1);
                edwVar.c("http://ns.google.com/photos/1.0/camera/", "MotionPhotoVersion", 1);
                edwVar.c("http://ns.google.com/photos/1.0/camera/", "MotionPhotoPresentationTimestampUs", Long.valueOf(j));
                int i2 = rarVar.a;
                if (!z) {
                    edy.a.c("http://ns.google.com/photos/1.0/container/", "Container");
                    eex eexVar = new eex();
                    eexVar.q();
                    eexVar.t();
                    edwVar.d("http://ns.google.com/photos/1.0/container/", "Directory", null, eexVar);
                }
                synchronized (rarVar) {
                    for (raq raqVar2 : rarVar.c) {
                        String strF = AmbientLifecycleObserverKt.F("Directory", i2);
                        raq.a(edwVar, strF);
                        String strConcat = strF.concat(AmbientLifecycleObserverKt.G("http://ns.google.com/photos/1.0/container/", "Item"));
                        edy.a.c("http://ns.google.com/photos/1.0/container/item/", "Item");
                        raq.a(edwVar, strConcat);
                        raq.e(edwVar, strConcat, "Mime", raqVar2.a);
                        raq.e(edwVar, strConcat, "Semantic", raqVar2.b);
                        raq.e(edwVar, strConcat, "Length", Integer.toString(raqVar2.c));
                        raq.e(edwVar, strConcat, CGlJpiVWrCQOq.nkWCbFRsyklgk, Integer.toString(raqVar2.d));
                        i2++;
                    }
                }
                return;
            }
        }
    }
}
