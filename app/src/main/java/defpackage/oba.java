package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.os.UserHandle;
import android.util.Log;
import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;
import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oba extends oao {
    public boolean a;
    public final oav c;
    public final obd d;
    public long e;
    public boolean f;
    private final obo g;
    private final obn h;
    private final oau i;
    private final obd j;
    private final obv k;

    protected oba(oar oarVar) {
        super(oarVar);
        this.h = new obn(oarVar);
        this.c = new oav(oarVar);
        this.g = new obo(oarVar);
        this.i = new oau(oarVar);
        this.k = new obv();
        this.j = new oax(this, oarVar);
        this.d = new oay(this, oarVar);
    }

    private final void H() {
        obd obdVar = this.j;
        if (obdVar.e()) {
            q("All hits dispatched or no network/service. Going to power save mode");
        }
        obdVar.c();
        obf obfVarH = h();
        if (obfVarH.c) {
            obfVarH.c();
        }
    }

    public final void D() {
        oak.a();
        oak.a();
        z();
        if (!obc.i()) {
            t("Service client disabled. Can't dispatch local hits to device AnalyticsService");
        }
        oau oauVar = this.i;
        if (!oauVar.D()) {
            q("Service not connected");
            return;
        }
        oav oavVar = this.c;
        if (oavVar.H()) {
            return;
        }
        q("Dispatching local hits to device AnalyticsService");
        while (true) {
            try {
                List listC = oavVar.c(obc.e());
                if (listC.isEmpty()) {
                    F();
                    return;
                }
                while (!listC.isEmpty()) {
                    obj objVar = (obj) listC.get(0);
                    if (!oauVar.E(objVar)) {
                        F();
                        return;
                    }
                    listC.remove(objVar);
                    try {
                        oavVar.D(objVar.b);
                    } catch (SQLiteException e) {
                        o("Failed to remove hit that was send for delivery", e);
                        H();
                        return;
                    }
                }
            } catch (SQLiteException e2) {
                o("Failed to read hits from store", e2);
                H();
                return;
            }
        }
    }

    public final void E() {
        z();
        oak.a();
        this.f = true;
        this.i.b();
        F();
    }

    public final void F() {
        long jMin;
        long jAbs;
        oak.a();
        z();
        if (!this.f) {
            if (b() > 0) {
                if (this.c.H()) {
                    this.h.c();
                    H();
                    return;
                }
                if (!((Boolean) obh.w.f()).booleanValue()) {
                    obn obnVar = this.h;
                    obnVar.b();
                    if (!obnVar.c) {
                        Context contextA = obnVar.a();
                        clu.d(contextA, obnVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 4);
                        IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
                        intentFilter.addCategory(contextA.getPackageName());
                        clu.d(contextA, obnVar, intentFilter, 4);
                        obnVar.d = obnVar.d();
                        obnVar.b.d().r("Registering connectivity change receiver. Network connected", Boolean.valueOf(obnVar.d));
                        obnVar.c = true;
                    }
                    if (!obnVar.d) {
                        H();
                        I();
                        return;
                    }
                }
                I();
                long jB = b();
                long jB2 = j().b();
                if (jB2 != 0) {
                    jMin = jB - Math.abs(System.currentTimeMillis() - jB2);
                    if (jMin <= 0) {
                        jMin = Math.min(obc.c(), jB);
                    }
                } else {
                    jMin = Math.min(obc.c(), jB);
                }
                r("Dispatch scheduled (ms)", Long.valueOf(jMin));
                obd obdVar = this.j;
                if (!obdVar.e()) {
                    obdVar.d(jMin);
                    return;
                }
                if (obdVar.d == 0) {
                    jAbs = 0;
                } else {
                    oar oarVar = obdVar.b;
                    jAbs = Math.abs(System.currentTimeMillis() - obdVar.d);
                }
                long jMax = Math.max(1L, jMin + jAbs);
                if (obdVar.e()) {
                    if (jMax < 0) {
                        obdVar.c();
                        return;
                    }
                    oar oarVar2 = obdVar.b;
                    long jAbs2 = jMax - Math.abs(System.currentTimeMillis() - obdVar.d);
                    long j = jAbs2 >= 0 ? jAbs2 : 0L;
                    Handler handlerB = obdVar.b();
                    Runnable runnable = obdVar.c;
                    handlerB.removeCallbacks(runnable);
                    if (obdVar.b().postDelayed(runnable, j)) {
                        return;
                    }
                    oarVar2.d().o("Failed to adjust delayed post. time", Long.valueOf(j));
                    return;
                }
                return;
            }
        }
        this.h.c();
        H();
    }

    public final boolean G(String str) {
        return ojo.b(d()).g(str) == 0;
    }

    @Override // defpackage.oao
    protected final void a() {
        this.c.A();
        this.g.A();
        this.i.A();
    }

    public final long b() {
        long jLongValue = ((Long) obh.c.f()).longValue();
        obw obwVarK = k();
        obwVarK.z();
        if (!obwVarK.d) {
            return jLongValue;
        }
        k().z();
        return r4.e * 1000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x021c, code lost:
    
        r10.m("GET request", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0221, code lost:
    
        r4 = r10.c(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0225, code lost:
    
        r4.connect();
        r10.F(r4);
        r12 = r4.getResponseCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0231, code lost:
    
        if (r12 != 200) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0233, code lost:
    
        r10.f().c();
        r12 = 200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x023c, code lost:
    
        r21 = r0;
        r10.m("GET status", java.lang.Integer.valueOf(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0247, code lost:
    
        if (r4 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0249, code lost:
    
        r4.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x024e, code lost:
    
        if (r12 == 200) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0252, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0254, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0256, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0257, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0259, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x025a, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x025b, code lost:
    
        r10.u("Network GET connection error", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0260, code lost:
    
        if (r4 != null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0262, code lost:
    
        r4.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0266, code lost:
    
        if (r4 != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0268, code lost:
    
        r4.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x026b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x026c, code lost:
    
        r21 = r0;
        r0 = r10.b(r11, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0273, code lost:
    
        if (r0 != null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0275, code lost:
    
        r10.i().b(r11, "Error formatting hit for POST upload");
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x027f, code lost:
    
        r0 = r0.getBytes();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0290, code lost:
    
        if (r0.length <= ((java.lang.Integer) defpackage.obh.q.f()).intValue()) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0292, code lost:
    
        r10.i().b(r11, "Hit payload exceeds size limit");
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x029c, code lost:
    
        r4 = r10.D(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02a0, code lost:
    
        if (r4 != null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02a2, code lost:
    
        r10.n("Failed to build collect POST endpoint url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02a8, code lost:
    
        r12 = r11.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02b0, code lost:
    
        if (r10.H(r4, r0) == 200) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02b3, code lost:
    
        r5.add(java.lang.Long.valueOf(r11.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02c4, code lost:
    
        if (r5.size() < defpackage.obc.e()) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02c7, code lost:
    
        r0 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02cb, code lost:
    
        r23 = r6;
        r25 = r8;
        r8 = r13;
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02db, code lost:
    
        defpackage.a.I(!r15.isEmpty());
        r10.s("Uploading batched hits. compression, count", java.lang.Boolean.valueOf(r5), java.lang.Integer.valueOf(r15.size()));
        r4 = new java.io.ByteArrayOutputStream();
        r11 = new java.util.ArrayList();
        r12 = r15.iterator();
        r15 = 0;
        r21 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0304, code lost:
    
        if (r12.hasNext() == false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0306, code lost:
    
        r22 = r5;
        r5 = (defpackage.obj) r12.next();
        defpackage.ojl.ay(r5);
        r0 = r21 + 1;
        r23 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x031a, code lost:
    
        if (r0 <= defpackage.obc.d()) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x031e, code lost:
    
        r17 = r10.b(r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0323, code lost:
    
        if (r17 != null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0325, code lost:
    
        r10.i().b(r5, "Error formatting hit");
        r25 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0331, code lost:
    
        r6 = r17.getBytes();
        r0 = r6.length;
        r25 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0346, code lost:
    
        if (r0 <= ((java.lang.Integer) defpackage.obh.p.f()).intValue()) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0348, code lost:
    
        r10.i().b(r5, "Hit size exceeds the maximum size limit");
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0356, code lost:
    
        if (r4.size() <= 0) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0358, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x036b, code lost:
    
        if ((r4.size() + r0) > ((java.lang.Integer) defpackage.obh.r.f()).intValue()) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0371, code lost:
    
        if (r4.size() <= 0) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0373, code lost:
    
        r4.write(defpackage.obo.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0378, code lost:
    
        r4.write(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x037b, code lost:
    
        r21 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x037e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x037f, code lost:
    
        r10.o("Failed to write payload when batching hits", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0399, code lost:
    
        r22 = r5;
        r23 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x039d, code lost:
    
        r25 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x039f, code lost:
    
        if (r21 != 0) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03a1, code lost:
    
        r16 = r11;
        r8 = r13;
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03a8, code lost:
    
        r15 = r10.C();
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03ac, code lost:
    
        if (r15 != null) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03ae, code lost:
    
        r10.n("Failed to build batching endpoint url");
        r5 = java.util.Collections.EMPTY_LIST;
        r8 = r13;
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03ba, code lost:
    
        if (r22 == false) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0084, code lost:
    
        q("Store is empty, nothing to dispatch");
        H();
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03bc, code lost:
    
        r0 = r4.toByteArray();
        defpackage.ojl.ay(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03c3, code lost:
    
        r4 = new java.io.ByteArrayOutputStream();
        r5 = new java.util.zip.GZIPOutputStream(r4);
        r5.write(r0);
        r5.close();
        r4.close();
        r4 = r4.toByteArray();
        r5 = r4.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03db, code lost:
    
        r8 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03dc, code lost:
    
        r13 = java.lang.Integer.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03e0, code lost:
    
        r8 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03e3, code lost:
    
        r0 = r0.length;
        r14 = java.lang.Long.valueOf((r8 * 100) / r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03f3, code lost:
    
        r16 = r11;
        r6 = true;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03fb, code lost:
    
        super.w(3, "POST compressed size, ratio %, url", r13, r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03fe, code lost:
    
        if (r5 <= r0) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0400, code lost:
    
        r10.v("Compressed payload is larger then uncompressed. compressed, uncompressed", r13, java.lang.Integer.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        r0 = r31.c;
        r0.G();
        r0.F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0409, code lost:
    
        defpackage.obo.x();
        r11 = r10.c(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0410, code lost:
    
        r11.setDoOutput(true);
        r11.addRequestProperty("Content-Encoding", "gzip");
        r11.setFixedLengthStreamingMode(r5);
        r11.connect();
        r5 = r11.getOutputStream();
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0424, code lost:
    
        r5.write(r4);
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x042a, code lost:
    
        r10.F(r11);
        r15 = r11.getResponseCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0433, code lost:
    
        if (r15 != 200) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0435, code lost:
    
        r10.f().c();
        r15 = 200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x043e, code lost:
    
        r10.m("POST status", java.lang.Integer.valueOf(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0447, code lost:
    
        if (r11 == null) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0449, code lost:
    
        r11.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x044c, code lost:
    
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x044f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0450, code lost:
    
        r4 = r11;
        r11 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0453, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0454, code lost:
    
        r4 = r11;
        r11 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0457, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0458, code lost:
    
        r4 = r0;
        r5 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x045b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x045c, code lost:
    
        r4 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x045e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0460, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0462, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0463, code lost:
    
        r16 = r11;
        r6 = true;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x046a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x046b, code lost:
    
        r16 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x046e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x046f, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0471, code lost:
    
        r4 = r0;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0473, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0096, code lost:
    
        o("Failed to commit local dispatch transaction", r0);
        H();
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0475, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0476, code lost:
    
        r16 = r11;
        r8 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0479, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x047b, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x047c, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x047d, code lost:
    
        r10.u("Network compressed POST connection error", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0482, code lost:
    
        if (r11 != null) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0484, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0488, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0489, code lost:
    
        r10.o("Error closing http compressed post connection output stream", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x048c, code lost:
    
        if (r4 != null) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x048e, code lost:
    
        r4.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0491, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0493, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0494, code lost:
    
        r5 = r4;
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0496, code lost:
    
        if (r11 != null) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0498, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x049c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x049d, code lost:
    
        r10.o("Error closing http compressed post connection output stream", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x04a0, code lost:
    
        if (r5 == null) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04a2, code lost:
    
        r5.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04a5, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x04a6, code lost:
    
        r16 = r11;
        r8 = r13;
        r6 = true;
        r5 = r10.H(r15, r4.toByteArray());
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x04b5, code lost:
    
        if (r5 != 200) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x04b7, code lost:
    
        r10.r("Batched upload completed. Hits batched", java.lang.Integer.valueOf(r21));
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x04c0, code lost:
    
        r5 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x04c3, code lost:
    
        r4 = java.lang.Integer.valueOf(r5);
        r10.r("Network error uploading hits. status code", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x04d8, code lost:
    
        if (r10.g().a().contains(r4) != false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x04da, code lost:
    
        r10.t("Server instructed the client to stop batching");
        r10.c.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x04e4, code lost:
    
        r5 = java.util.Collections.EMPTY_LIST;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x04e6, code lost:
    
        r0 = r5.iterator();
        r11 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x04f2, code lost:
    
        r11 = java.lang.Math.max(r11, ((java.lang.Long) r0.next()).longValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0501, code lost:
    
        r31.c.E(r5);
        r7.addAll(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x050d, code lost:
    
        if (r7.isEmpty() != false) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x050f, code lost:
    
        r0 = r31.c;
        r0.G();
        r0.F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0519, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x051a, code lost:
    
        o("Failed to commit local dispatch transaction", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0521, code lost:
    
        r0 = r31.c;
        r0.G();
        r0.F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0531, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0532, code lost:
    
        o("Failed to commit local dispatch transaction", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0536, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0537, code lost:
    
        o("Failed to remove successfully uploaded hits", r0);
        H();
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x053f, code lost:
    
        r0 = r31.c;
        r0.G();
        r0.F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0548, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0549, code lost:
    
        o("Failed to commit local dispatch transaction", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x054d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x054e, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x056d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c2, code lost:
    
        p("Database contains successfully uploaded hit", java.lang.Long.valueOf(r8), java.lang.Integer.valueOf(r15.size()));
        H();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d6, code lost:
    
        r0 = r31.c;
        r0.G();
        r0.F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e1, code lost:
    
        o("Failed to commit local dispatch transaction", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e4, code lost:
    
        H();
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:?, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ec, code lost:
    
        r19 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ee, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f3, code lost:
    
        if (r6.D() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f5, code lost:
    
        q("Service connected, sending hits to the service");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fe, code lost:
    
        if (r15.isEmpty() != false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0100, code lost:
    
        r4 = (defpackage.obj) r15.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010a, code lost:
    
        if (r6.E(r4) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010d, code lost:
    
        r11 = r4.b;
        r8 = java.lang.Math.max(r8, r11);
        r15.remove(r4);
        m("Hit sent do device AnalyticsService for delivery", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011b, code lost:
    
        r0.D(r11);
        r7.add(java.lang.Long.valueOf(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0125, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0127, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0128, code lost:
    
        o("Failed to remove hit that was send for delivery", r0);
        H();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0130, code lost:
    
        r0 = r31.c;
        r0.G();
        r0.F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013b, code lost:
    
        o("Failed to commit local dispatch transaction", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0143, code lost:
    
        if (r10.G() != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0145, code lost:
    
        r23 = r6;
        r11 = r8;
        r8 = r13;
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014c, code lost:
    
        defpackage.oak.a();
        r10.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015e, code lost:
    
        if (r10.g().a().isEmpty() != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r10.c.c(((java.lang.Integer) defpackage.obh.t.f()).intValue() * 1000) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0179, code lost:
    
        r0 = (java.lang.String) defpackage.obh.n.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0187, code lost:
    
        if ("BATCH_BY_SESSION".equalsIgnoreCase(r0) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0189, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0191, code lost:
    
        if ("BATCH_BY_TIME".equalsIgnoreCase(r0) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019a, code lost:
    
        if ("BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(r0) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a3, code lost:
    
        if ("BATCH_BY_COUNT".equalsIgnoreCase(r0) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ac, code lost:
    
        if ("BATCH_BY_SIZE".equalsIgnoreCase(r0) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01af, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bf, code lost:
    
        if (true == "GZIP".equalsIgnoreCase((java.lang.String) defpackage.obh.o.f())) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c2, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c4, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c5, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c6, code lost:
    
        if (r0 != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c8, code lost:
    
        r5 = new java.util.ArrayList(r15.size());
        r0 = r15.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d9, code lost:
    
        if (r0.hasNext() == false) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01db, code lost:
    
        r11 = (defpackage.obj) r0.next();
        defpackage.ojl.ay(r11);
        r12 = r10.b(r11, !r11.e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ee, code lost:
    
        if (r12 != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f0, code lost:
    
        r10.i().b(r11, "Error formatting hit for upload");
        r21 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x020d, code lost:
    
        if (r12.length() > ((java.lang.Integer) defpackage.obh.m.f()).intValue()) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x020f, code lost:
    
        r4 = r10.E(r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0213, code lost:
    
        if (r4 != null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0215, code lost:
    
        r10.n("Failed to build collect GET endpoint url");
     */
    /* JADX WARN: Removed duplicated region for block: B:232:0x048e A[Catch: all -> 0x056d, TRY_LEAVE, TryCatch #6 {all -> 0x056d, blocks: (B:259:0x0509, B:253:0x04e6, B:254:0x04ec, B:256:0x04f2, B:258:0x0501, B:273:0x0537, B:198:0x0449, B:247:0x04b7, B:249:0x04c3, B:251:0x04da, B:252:0x04e4, B:237:0x0498, B:242:0x04a2, B:243:0x04a5, B:240:0x049d, B:227:0x0484, B:232:0x048e, B:230:0x0489, B:244:0x04a6, B:285:0x0557), top: B:323:0x04f2, inners: #11, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04a2 A[Catch: all -> 0x056d, TryCatch #6 {all -> 0x056d, blocks: (B:259:0x0509, B:253:0x04e6, B:254:0x04ec, B:256:0x04f2, B:258:0x0501, B:273:0x0537, B:198:0x0449, B:247:0x04b7, B:249:0x04c3, B:251:0x04da, B:252:0x04e4, B:237:0x0498, B:242:0x04a2, B:243:0x04a5, B:240:0x049d, B:227:0x0484, B:232:0x048e, B:230:0x0489, B:244:0x04a6, B:285:0x0557), top: B:323:0x04f2, inners: #11, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04b7 A[Catch: all -> 0x056d, TryCatch #6 {all -> 0x056d, blocks: (B:259:0x0509, B:253:0x04e6, B:254:0x04ec, B:256:0x04f2, B:258:0x0501, B:273:0x0537, B:198:0x0449, B:247:0x04b7, B:249:0x04c3, B:251:0x04da, B:252:0x04e4, B:237:0x0498, B:242:0x04a2, B:243:0x04a5, B:240:0x049d, B:227:0x0484, B:232:0x048e, B:230:0x0489, B:244:0x04a6, B:285:0x0557), top: B:323:0x04f2, inners: #11, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04c3 A[Catch: all -> 0x056d, TryCatch #6 {all -> 0x056d, blocks: (B:259:0x0509, B:253:0x04e6, B:254:0x04ec, B:256:0x04f2, B:258:0x0501, B:273:0x0537, B:198:0x0449, B:247:0x04b7, B:249:0x04c3, B:251:0x04da, B:252:0x04e4, B:237:0x0498, B:242:0x04a2, B:243:0x04a5, B:240:0x049d, B:227:0x0484, B:232:0x048e, B:230:0x0489, B:244:0x04a6, B:285:0x0557), top: B:323:0x04f2, inners: #11, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x058d A[Catch: Exception -> 0x05b4, TryCatch #5 {Exception -> 0x05b4, blocks: (B:7:0x0034, B:10:0x004f, B:300:0x0581, B:302:0x058d, B:303:0x0590, B:305:0x0596, B:13:0x0059, B:18:0x008c, B:21:0x0096, B:32:0x00d6, B:35:0x00e1, B:36:0x00e4, B:296:0x0573, B:297:0x057b, B:299:0x057d, B:265:0x051d, B:53:0x0130, B:56:0x013b, B:261:0x050f, B:267:0x0521, B:264:0x051a, B:270:0x0532, B:274:0x053f, B:277:0x0549, B:286:0x055f, B:289:0x0569, B:15:0x007a, B:17:0x0084, B:23:0x009d, B:49:0x011b, B:258:0x0501), top: B:322:0x0034, inners: #0, #2, #3, #4, #9, #10, #12, #15, #17, #19, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0596 A[Catch: Exception -> 0x05b4, TRY_LEAVE, TryCatch #5 {Exception -> 0x05b4, blocks: (B:7:0x0034, B:10:0x004f, B:300:0x0581, B:302:0x058d, B:303:0x0590, B:305:0x0596, B:13:0x0059, B:18:0x008c, B:21:0x0096, B:32:0x00d6, B:35:0x00e1, B:36:0x00e4, B:296:0x0573, B:297:0x057b, B:299:0x057d, B:265:0x051d, B:53:0x0130, B:56:0x013b, B:261:0x050f, B:267:0x0521, B:264:0x051a, B:270:0x0532, B:274:0x053f, B:277:0x0549, B:286:0x055f, B:289:0x0569, B:15:0x007a, B:17:0x0084, B:23:0x009d, B:49:0x011b, B:258:0x0501), top: B:322:0x0034, inners: #0, #2, #3, #4, #9, #10, #12, #15, #17, #19, #22 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x050f A[EDGE_INSN: B:312:0x050f->B:261:0x050f BREAK  A[LOOP:0: B:324:0x006b->B:268:0x0529], EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0484 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0521 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0498 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:380:? A[Catch: all -> 0x056d, SYNTHETIC, TryCatch #6 {all -> 0x056d, blocks: (B:259:0x0509, B:253:0x04e6, B:254:0x04ec, B:256:0x04f2, B:258:0x0501, B:273:0x0537, B:198:0x0449, B:247:0x04b7, B:249:0x04c3, B:251:0x04da, B:252:0x04e4, B:237:0x0498, B:242:0x04a2, B:243:0x04a5, B:240:0x049d, B:227:0x0484, B:232:0x048e, B:230:0x0489, B:244:0x04a6, B:285:0x0557), top: B:323:0x04f2, inners: #11, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:381:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:382:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.obg r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oba.c(obg):void");
    }

    public final void C() {
        obk obkVar;
        if (!this.f && obc.i()) {
            oau oauVar = this.i;
            if (oauVar.D()) {
                return;
            }
            long jLongValue = ((Long) obh.z.f()).longValue();
            obv obvVar = this.k;
            if (obvVar.c(jLongValue)) {
                obvVar.b();
                q("Connecting to service");
                oak.a();
                oauVar.z();
                if (oauVar.c == null) {
                    oat oatVar = oauVar.a;
                    oau oauVar2 = oatVar.b;
                    oak.a();
                    Intent intent = new Intent("com.google.android.gms.analytics.service.START");
                    intent.setComponent(new ComponentName("com.google.android.gms", nWEkBGOQPWQp.jDuBhRu));
                    Context contextD = oauVar2.d();
                    intent.putExtra("app_package_name", contextD.getPackageName());
                    ojf ojfVarA = ojf.a();
                    synchronized (oatVar) {
                        obkVar = null;
                        oatVar.c = null;
                        oatVar.a = true;
                        oau oauVar3 = oatVar.b;
                        boolean zC = ojfVarA.c(contextD, contextD.getClass().getName(), intent, oauVar3.a, 129);
                        oauVar3.r("Bind to service requested", Boolean.valueOf(zC));
                        if (zC) {
                            try {
                                oatVar.wait(((Long) obh.y.f()).longValue());
                            } catch (InterruptedException unused) {
                                oatVar.b.t("Wait for service connect was interrupted");
                            }
                            oatVar.a = false;
                            obk obkVar2 = oatVar.c;
                            oatVar.c = null;
                            if (obkVar2 == null) {
                                oatVar.b.n("Successfully bound to service but never got onServiceConnected callback");
                            }
                            obkVar = obkVar2;
                        } else {
                            oatVar.a = false;
                        }
                    }
                    if (obkVar == null) {
                        return;
                    }
                    oauVar.c = obkVar;
                    oauVar.C();
                }
                q("Connected to service");
                this.k.a();
                D();
            }
        }
    }

    private final void I() throws Throwable {
        long j;
        Cursor cursorRawQuery;
        obf obfVarH = h();
        if (obfVarH.a && !obfVarH.c) {
            oak.a();
            z();
            Cursor cursor = null;
            int iIntValue = 0;
            try {
                try {
                    oav oavVar = this.c;
                    oak.a();
                    oavVar.z();
                    String str = oav.c;
                    try {
                        cursorRawQuery = oavVar.b().rawQuery(str, null);
                    } catch (SQLiteException e) {
                        e = e;
                    } catch (Throwable th) {
                        th = th;
                        if (0 != 0) {
                            cursor.close();
                        }
                        throw th;
                    }
                    try {
                    } catch (SQLiteException e2) {
                        e = e2;
                        oavVar.p("Database error", str, e);
                        throw e;
                    }
                } catch (SQLiteException e3) {
                    o("Failed to get min/max hit times from local store", e3);
                }
                if (cursorRawQuery.moveToFirst()) {
                    j = cursorRawQuery.getLong(0);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    if (j == 0 && Math.abs(System.currentTimeMillis() - j) <= ((Long) obh.f.f()).longValue()) {
                        r("Dispatch alarm scheduled (ms)", Long.valueOf(obc.b()));
                        obfVarH.z();
                        ojl.av(obfVarH.a, "Receiver not registered");
                        obfVarH.g();
                        long jB = obc.b();
                        if (jB > 0) {
                            obfVarH.c();
                            obfVarH.y();
                            SystemClock.elapsedRealtime();
                            obfVarH.c = true;
                            ((Boolean) obh.C.f()).booleanValue();
                            obfVarH.q("Scheduling upload with JobScheduler");
                            Context contextD = obfVarH.d();
                            ComponentName componentName = new ComponentName(contextD, KsvNaXS.ZdWzk);
                            int iB = obfVarH.b();
                            PersistableBundle persistableBundle = new PersistableBundle();
                            persistableBundle.putString(TOnSyMaYeslEl.icGOchDDRb, "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
                            JobInfo jobInfoBuild = new JobInfo.Builder(iB, componentName).setMinimumLatency(jB).setOverrideDeadline(jB + jB).setExtras(persistableBundle).build();
                            obfVarH.r("Scheduling job. JobID", Integer.valueOf(iB));
                            JobScheduler jobScheduler = (JobScheduler) contextD.getSystemService("jobscheduler");
                            jobScheduler.getClass();
                            if (olq.a != null && contextD.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") == 0) {
                                Method method = olq.b;
                                if (method != null) {
                                    try {
                                        Integer num = (Integer) method.invoke(UserHandle.class, null);
                                        if (num != null) {
                                            iIntValue = num.intValue();
                                        }
                                    } catch (IllegalAccessException | InvocationTargetException e4) {
                                        if (Log.isLoggable("JobSchedulerCompat", 6)) {
                                            Log.e("JobSchedulerCompat", "myUserId invocation illegal", e4);
                                        }
                                    }
                                }
                                Method method2 = olq.a;
                                if (method2 != null) {
                                    try {
                                        Integer num2 = (Integer) method2.invoke(jobScheduler, jobInfoBuild, "com.google.android.gms", Integer.valueOf(iIntValue), "DispatchAlarm");
                                        if (num2 != null) {
                                            num2.intValue();
                                            return;
                                        }
                                        return;
                                    } catch (IllegalAccessException | InvocationTargetException e5) {
                                        Log.e("DispatchAlarm", "error calling scheduleAsPackage", e5);
                                    }
                                }
                                jobScheduler.schedule(jobInfoBuild);
                                return;
                            }
                            jobScheduler.schedule(jobInfoBuild);
                            return;
                        }
                        return;
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                j = 0;
                if (j == 0) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
