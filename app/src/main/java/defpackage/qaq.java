package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.clockwork.common.wearable.wearmaterial.button.WearChipButton;
import j$.util.Objects;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qaq {
    public final Object a;

    public qaq(Object obj) {
        this.a = obj;
    }

    public static final int u(MotionEvent motionEvent) {
        return (-motionEvent.getAxisValue(26)) > 0.0f ? 1 : -1;
    }

    private final int z() {
        kq kqVar;
        Object obj = this.a;
        if (!(obj instanceof RecyclerView) || (kqVar = ((RecyclerView) obj).m) == null) {
            return 1;
        }
        if (kqVar.Y()) {
            return 3;
        }
        return kqVar.X() ? 2 : 1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, rww] */
    public final pux a() {
        return (pux) this.a.fr();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023 A[Catch: all -> 0x0049, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:7:0x000a, B:9:0x000e, B:11:0x001c, B:14:0x0023, B:16:0x0027, B:21:0x0033, B:25:0x0039), top: B:31:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void c(defpackage.cyu r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r7 instanceof defpackage.czd     // Catch: java.lang.Throwable -> L49
            r1 = 1
            if (r0 != 0) goto L39
            boolean r0 = r7 instanceof defpackage.czc     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L39
            boolean r0 = r7 instanceof defpackage.cze     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L23
            r0 = r7
            cze r0 = (defpackage.cze) r0     // Catch: java.lang.Throwable -> L49
            long r2 = r0.a     // Catch: java.lang.Throwable -> L49
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L23
            long r2 = r0.b     // Catch: java.lang.Throwable -> L49
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L23
            goto L39
        L23:
            boolean r0 = r7 instanceof defpackage.czb     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L33
            r0 = r7
            czb r0 = (defpackage.czb) r0     // Catch: java.lang.Throwable -> L49
            int r0 = r0.d     // Catch: java.lang.Throwable -> L49
            if (r0 == r1) goto L39
            r2 = 23
            if (r0 != r2) goto L33
            goto L39
        L33:
            boolean r0 = r7 instanceof defpackage.czj     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L38
            goto L39
        L38:
            r1 = 0
        L39:
            java.lang.Object r0 = r6.a     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "Unsupported metadata"
            defpackage.coi.w(r1, r2)     // Catch: java.lang.Throwable -> L49
            czq r0 = (defpackage.czq) r0     // Catch: java.lang.Throwable -> L49
            czo r0 = r0.a     // Catch: java.lang.Throwable -> L49
            r0.a(r7)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r6)
            return
        L49:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L49
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qaq.c(cyu):void");
    }

    public final synchronized void d() {
        ((czq) this.a).close();
    }

    public final synchronized void e(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        boolean z;
        int i2;
        czh czhVar;
        int i3;
        int iRemaining;
        long j = bufferInfo.presentationTimeUs;
        int i4 = bufferInfo.size;
        int i5 = bufferInfo.flags;
        byte[] bArr = cza.a;
        int i6 = i5 & 1;
        int i7 = 4;
        if ((i5 & 4) == 4) {
            i6 |= 4;
        }
        Object obj = this.a;
        czn cznVar = new czn(j, i4, i6);
        czt cztVar = (czt) ((czq) obj).c.get(i);
        try {
            if (((czq) obj).d.contains(cztVar)) {
                throw null;
            }
            czr czrVar = ((czq) obj).b;
            cyr cyrVar = cztVar.b;
            if (Objects.equals(cyrVar.h, "video/av01") && cyrVar.j.isEmpty() && cztVar.j == null) {
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                ArrayList arrayList = new ArrayList();
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBufferDuplicate.asReadOnlyBuffer();
                ArrayList<qev> arrayList2 = new ArrayList();
                while (true) {
                    i2 = 128;
                    if (!byteBufferAsReadOnlyBuffer.hasRemaining()) {
                        break;
                    }
                    byte b = byteBufferAsReadOnlyBuffer.get();
                    int i8 = (b >> 3) & 15;
                    if (((b >> 2) & 1) != 0) {
                        byteBufferAsReadOnlyBuffer.get();
                    }
                    if (((b >> 1) & 1) != 0) {
                        iRemaining = 0;
                        for (int i9 = 0; i9 < 8; i9++) {
                            byte b2 = byteBufferAsReadOnlyBuffer.get();
                            iRemaining |= (b2 & 127) << (i9 * 7);
                            if ((b2 & 128) == 0) {
                                break;
                            }
                        }
                    } else {
                        iRemaining = byteBufferAsReadOnlyBuffer.remaining();
                    }
                    ByteBuffer byteBufferDuplicate2 = byteBufferAsReadOnlyBuffer.duplicate();
                    byteBufferDuplicate2.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
                    arrayList2.add(new qev(i8, byteBufferDuplicate2));
                    byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
                }
                ByteBuffer byteBufferL = null;
                ByteBuffer byteBufferAllocate = null;
                for (qev qevVar : arrayList2) {
                    int i10 = qevVar.a;
                    if (i10 == 5) {
                        arrayList.add(com.y(qevVar));
                    } else {
                        if (i10 == 1 && byteBufferL == null) {
                            byteBufferL = com.y(qevVar);
                            byteBufferAllocate = ByteBuffer.allocate(i7);
                            byteBufferAllocate.put((byte) -127);
                            try {
                                czhVar = new czh(qevVar);
                            } catch (czg unused) {
                                czhVar = null;
                            }
                            coi.A(czhVar, "No sequence header available.");
                            byteBufferAllocate.put((byte) ((czhVar.c << 5) | czhVar.d));
                            int i11 = 1 != czhVar.e ? 0 : i2;
                            int i12 = true != czhVar.h ? 0 : 64;
                            i3 = i7;
                            byteBufferAllocate.put((byte) ((true != czhVar.i ? 0 : 32) | i11 | i12 | (true != czhVar.j ? 0 : 16) | (true != czhVar.k ? 0 : 8) | (true != czhVar.l ? 0 : i3) | czhVar.m));
                            boolean z2 = czhVar.f;
                            byteBufferAllocate.put((byte) ((true != z2 ? 0 : 16) | (z2 ? czhVar.g & 15 : 0)));
                            byteBufferAllocate.flip();
                        }
                        i7 = i3;
                        i2 = 128;
                    }
                    i3 = i7;
                    i7 = i3;
                    i2 = 128;
                }
                coi.A(byteBufferL, "No sequence header available.");
                z = false;
                ByteBuffer byteBufferL2 = com.l((ByteBuffer[]) arrayList.toArray(new ByteBuffer[0]));
                if (byteBufferL2 != null) {
                    byteBufferL = com.l(byteBufferL, byteBufferL2);
                }
                coi.A(byteBufferAllocate, "csdHeader is null.");
                cztVar.j = com.l(byteBufferAllocate, byteBufferL).array();
            } else {
                z = false;
            }
            coi.w(cztVar.k == -9223372036854775807L ? true : z, "Samples can not be written after writing a sample with MediaCodec.BUFFER_FLAG_END_OF_STREAM flag");
            if (cznVar.b != 0 && byteBuffer.remaining() != 0) {
                int i13 = cznVar.c;
                if ((i13 & 1) > 0) {
                    cztVar.i = true;
                }
                if (cztVar.i || !cyv.c(cztVar.b.h)) {
                    boolean z3 = cztVar.l;
                    cztVar.g.addLast(new czn(cznVar.a, byteBuffer.remaining(), i13));
                    cztVar.h.addLast(byteBuffer);
                }
            } else if ((cznVar.c & 4) != 0) {
                cztVar.k = cznVar.a;
            }
            if (czrVar.d) {
                boolean zD = czrVar.d(czrVar.e);
                czrVar.d(czrVar.f);
                if (zD && czrVar.h) {
                    czrVar.b();
                }
            } else {
                czrVar.c(cztVar);
                boolean zContains = czrVar.e.contains(cztVar);
                long j2 = cznVar.a;
                if (zContains && czrVar.h && j2 - czrVar.i >= 1000000) {
                    czrVar.b();
                    czrVar.i = j2;
                }
            }
        } catch (IOException e) {
            throw new czs("Failed to write sample for presentationTimeUs=" + cznVar.a + ", size=" + cznVar.b, e);
        }
    }

    public final syu f(Callable callable, Executor executor) {
        return ((syj) this.a).a(rsx.f(callable), executor);
    }

    public final syu g(sxh sxhVar, Executor executor) {
        return ((syj) this.a).b(rsx.b(sxhVar), executor);
    }

    public final syu h(Callable callable, Executor executor) {
        return ((sxy) ((rtl) this.a).a).a(rsx.f(callable), executor);
    }

    public final syu i(sxh sxhVar, Executor executor) {
        return ((sxy) ((rtl) this.a).a).b(rsx.b(sxhVar), executor);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final sbv j() {
        rnt.B(true, "SharedPreferencesView#getAll() not available on key migration");
        return sbv.m(this.a.getAll());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final long k(String str) {
        return this.a.getLong(str, 0L);
    }

    public final String l(Uri uri, String str, String str2) {
        aaa aaaVar;
        if (uri != null) {
            aaaVar = (aaa) ((aaa) this.a).get(uri.toString());
        } else {
            aaaVar = null;
        }
        if (aaaVar == null) {
            return null;
        }
        if (str != null) {
            str2 = str.concat(String.valueOf(str2));
        }
        return (String) aaaVar.get(str2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable, java.lang.Object] */
    public final qgi m() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((qff) it.next()).a());
        }
        return new qgi(qpt.aj(arrayList).a(sxo.a, new qfj()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, pxq] */
    public final puk n(Throwable th, int i) {
        if (i >= 5) {
            return puk.UNKNOWN_ERROR;
        }
        puk pukVarA = this.a.a(th);
        puk pukVar = puk.UNKNOWN_ERROR;
        return !pukVarA.equals(pukVar) ? pukVarA : th instanceof pul ? ((pul) th).a : (!(th instanceof nzz) || ((nzz) th).a.b == -1) ? th.getCause() != null ? n(th.getCause(), i + 1) : th instanceof nzi ? puk.ANDROID_DOWNLOADER2_ERROR : pukVar : puk.ANDROID_DOWNLOADER_HTTP_ERROR;
    }

    public final pqa o() {
        return new pqa(new ContentValues((ContentValues) this.a));
    }

    public final void p(String str, int i) {
        ((ContentValues) this.a).put(str, (Integer) 0);
    }

    public final void q(String str, String str2) {
        ((ContentValues) this.a).put(str, str2);
    }

    public final int r() {
        return ((qkz) this.a).b;
    }

    public final long s() {
        return ((qkz) this.a).c;
    }

    public final ByteBuffer t() {
        return ((qkz) this.a).a;
    }

    public final boolean v(int i, int i2, boolean z) {
        if (z() == 3) {
            boolean zCanScrollVertically = ((View) this.a).canScrollVertically(1);
            return z ? !zCanScrollVertically && i2 > 0 : !zCanScrollVertically;
        }
        if (z() != 2) {
            return false;
        }
        boolean zCanScrollHorizontally = ((View) this.a).canScrollHorizontally(1);
        return z ? !zCanScrollHorizontally && i > 0 : !zCanScrollHorizontally;
    }

    public final boolean w(int i, int i2, boolean z) {
        if (z() == 3) {
            boolean zCanScrollVertically = ((View) this.a).canScrollVertically(-1);
            return z ? !zCanScrollVertically && i2 < 0 : !zCanScrollVertically;
        }
        if (z() != 2) {
            return false;
        }
        boolean zCanScrollHorizontally = ((View) this.a).canScrollHorizontally(-1);
        return z ? !zCanScrollHorizontally && i < 0 : !zCanScrollHorizontally;
    }

    public final void x(dbh dbhVar) {
        View view = dbhVar.a;
        if (view instanceof WearChipButton) {
            WearChipButton wearChipButton = (WearChipButton) view;
            Object obj = this.a;
            Preference preference = (Preference) obj;
            wearChipButton.p(preference.u());
            wearChipButton.q(preference.m());
            Drawable drawableR = preference.r();
            wearChipButton.r();
            if (drawableR == null) {
                wearChipButton.o.setVisibility(8);
            } else {
                wearChipButton.o.setImageDrawable(drawableR);
                wearChipButton.o.setVisibility(0);
                wearChipButton.o.setDuplicateParentStateEnabled(true);
            }
            wearChipButton.n();
            if (obj instanceof TwoStatePreference) {
                wearChipButton.setChecked(((TwoStatePreference) obj).a);
            }
        }
    }

    public final boolean y() {
        Object obj = this.a;
        if (obj == null) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) obj;
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public qaq(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new oow();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized int b(int r18, android.media.MediaFormat r19) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qaq.b(int, android.media.MediaFormat):int");
    }

    public qaq(short[] sArr, byte[] bArr) {
        this.a = new qaq(null, null, null, null);
    }

    public qaq(Context context, byte[] bArr, char[] cArr) {
        this.a = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public qaq(Context context, short[] sArr) {
        this.a = context.getApplicationContext();
    }

    public qaq(char[] cArr, byte[] bArr) {
        this.a = new TreeMap();
    }

    public qaq(View view) {
        if (!(view instanceof RecyclerView)) {
            throw new UnsupportedOperationException("RotaryInputHapticsHelper only supports RecyclerView, ScrollView, HorizontalScrollView & NestedScrollView");
        }
        this.a = view;
    }

    public qaq(byte[] bArr, byte[] bArr2) {
        this(new ContentValues());
    }

    public qaq(short[] sArr) {
        this.a = new HashMap();
    }

    public qaq(puu puuVar) {
        this.a = rnt.y(new nxi(puuVar, 5));
    }

    public qaq(Context context) {
        this.a = context.getApplicationContext();
    }

    public qaq() {
        tzf tzfVar = tzf.LOGGER_DEFERRING_PROVIDER;
        a.I(true);
        ojl.ay(tzfVar);
        this.a = new ocg(tzfVar);
    }

    public qaq(Context context, byte[] bArr) {
        List list = occ.m;
        oco ocoVar = oco.a;
        ojl.aw("ICING");
        this.a = new occ(context, "ICING", null, ocoVar, null, null, new qaq());
    }

    public qaq(byte[] bArr) {
        this.a = new rtl((char[]) null);
    }

    public qaq(Context context, char[] cArr, byte[] bArr) {
        this.a = rnt.y(new nxi(context, 10));
    }

    public qaq(Context context, byte[] bArr, byte[] bArr2) {
        rnt.B(true, "Context cannot be null");
        this.a = context.getApplicationContext();
    }
}
