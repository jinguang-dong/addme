package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.media.AudioAttributes;
import android.os.Bundle;
import android.os.SystemClock;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;
import com.google.android.material.button.xlT.JvFFEwFNdCrxf;
import com.google.ar.core.R;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.DesugarArrays;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hjb {
    private static final sgv A = sgv.g("hjb");
    private static final sbv B;
    private static final sbv C;
    public static final /* synthetic */ int z = 0;
    private final AudioAttributes D;
    private final AudioAttributes E;
    private final owf F;
    private volatile hjc J;
    private int K;
    private int L;
    private String M;
    private long N;
    private boolean O;
    private muv P;
    private boolean Q;
    public final Context a;
    public final owf c;
    public final owf d;
    public final uem e;
    public final UtteranceProgressListener f;
    public pnu o;
    public Rect p;
    public volatile hjc u;
    public muz v;
    public muz w;
    public boolean x;
    public final mwq y;
    public final int[][] b = {new int[]{R.string.top_left, R.string.top_center, R.string.top_right}, new int[]{R.string.left, R.string.center, R.string.right}, new int[]{R.string.bottom_left, R.string.bottom_center, R.string.bottom_right}};
    public final Set g = new HashSet();
    private final int[][] G = {new int[]{R.string.move_phone_up_left, R.string.move_phone_up, R.string.move_phone_up_right}, new int[]{R.string.move_phone_left, 0, R.string.move_phone_right}, new int[]{R.string.move_phone_down_left, R.string.move_phone_down, R.string.move_phone_down_right}};
    private final int[][] H = {new int[]{R.string.rotate_face_down_right, R.string.rotate_face_down, R.string.rotate_face_down_left}, new int[]{R.string.rotate_face_right, 0, R.string.rotate_face_left}, new int[]{R.string.rotate_face_up_right, R.string.rotate_face_up, R.string.rotate_face_up_left}};
    public long h = -1;
    public int i = -1;
    private int I = -1;
    public boolean j = true;
    public boolean k = false;
    public boolean l = false;
    private int R = 1;
    public boolean m = false;
    public boolean n = false;
    public mwd q = mwd.IDLE;
    public owf r = new owi(new mwl[0]);
    public pas s = new pas(4, 3);
    public Optional t = Optional.empty();

    static {
        sbr sbrVar = new sbr();
        muz muzVar = muz.FACE_CAM_HAL;
        Integer numValueOf = Integer.valueOf(R.string.number_of_object_face_plurals_one);
        sbrVar.f(muzVar, numValueOf);
        sbrVar.f(muz.FACE, numValueOf);
        muz muzVar2 = muz.DOG;
        Integer numValueOf2 = Integer.valueOf(R.string.number_of_object_dog_plurals_one);
        sbrVar.f(muzVar2, numValueOf2);
        sbrVar.f(muz.DOG_FACE, numValueOf2);
        muz muzVar3 = muz.CAT;
        Integer numValueOf3 = Integer.valueOf(R.string.number_of_object_cat_plurals_one);
        sbrVar.f(muzVar3, numValueOf3);
        sbrVar.f(muz.CAT_FACE, numValueOf3);
        sbrVar.f(muz.PET, Integer.valueOf(R.string.number_of_object_pet_plurals_one));
        sbrVar.f(muz.FOOD, Integer.valueOf(R.string.number_of_object_food_plurals_one));
        sbrVar.f(muz.DRINK, Integer.valueOf(R.string.number_of_object_drink_plurals_one));
        muz muzVar4 = muz.MONITOR;
        Integer numValueOf4 = Integer.valueOf(R.string.number_of_object_electronic_group_plurals_one);
        sbrVar.f(muzVar4, numValueOf4);
        sbrVar.f(muz.TABLET, numValueOf4);
        sbrVar.f(muz.COMPUTER, numValueOf4);
        sbrVar.f(muz.MOBILE_PHONE, numValueOf4);
        sbrVar.f(muz.LAPTOP, numValueOf4);
        sbrVar.f(muz.V, numValueOf4);
        sbrVar.f(muz.CAR, Integer.valueOf(R.string.number_of_object_car_plurals_one));
        sbrVar.f(muz.BUS, Integer.valueOf(R.string.number_of_object_bus_plurals_one));
        sbrVar.f(muz.TRUCK, Integer.valueOf(R.string.number_of_object_truck_plurals_one));
        muz muzVar5 = muz.BOOKS;
        Integer numValueOf5 = Integer.valueOf(R.string.number_of_object_document_plurals_one);
        sbrVar.f(muzVar5, numValueOf5);
        sbrVar.f(muz.BUSINESS_CARD, numValueOf5);
        sbrVar.f(muz.GREETING_CARD, numValueOf5);
        sbrVar.f(muz.MAGAZINE, numValueOf5);
        sbrVar.f(muz.MEDIA_COVER, numValueOf5);
        sbrVar.f(muz.PICTURE_FRAME, numValueOf5);
        sbrVar.f(muz.POSTER, numValueOf5);
        sbrVar.f(muz.POST_IT_NOTE, numValueOf5);
        sbrVar.f(muz.ENVELOPE, numValueOf5);
        sbrVar.f(muz.ai, numValueOf5);
        sbrVar.f(muz.DOCUMENT, numValueOf5);
        B = sbrVar.b();
        sbr sbrVar2 = new sbr();
        muz muzVar6 = muz.FACE_CAM_HAL;
        Integer numValueOf6 = Integer.valueOf(R.string.number_of_object_face_plurals_other);
        sbrVar2.f(muzVar6, numValueOf6);
        sbrVar2.f(muz.FACE, numValueOf6);
        muz muzVar7 = muz.DOG;
        Integer numValueOf7 = Integer.valueOf(R.string.number_of_object_dog_plurals_other);
        sbrVar2.f(muzVar7, numValueOf7);
        sbrVar2.f(muz.DOG_FACE, numValueOf7);
        muz muzVar8 = muz.CAT;
        Integer numValueOf8 = Integer.valueOf(R.string.number_of_object_cat_plurals_other);
        sbrVar2.f(muzVar8, numValueOf8);
        sbrVar2.f(muz.CAT_FACE, numValueOf8);
        sbrVar2.f(muz.PET, Integer.valueOf(R.string.number_of_object_pet_plurals_other));
        sbrVar2.f(muz.FOOD, Integer.valueOf(R.string.number_of_object_food_plurals_other));
        sbrVar2.f(muz.DRINK, Integer.valueOf(R.string.number_of_object_drink_plurals_other));
        muz muzVar9 = muz.MONITOR;
        Integer numValueOf9 = Integer.valueOf(R.string.number_of_object_electronic_group_plurals_other);
        sbrVar2.f(muzVar9, numValueOf9);
        sbrVar2.f(muz.TABLET, numValueOf9);
        sbrVar2.f(muz.COMPUTER, numValueOf9);
        sbrVar2.f(muz.MOBILE_PHONE, numValueOf9);
        sbrVar2.f(muz.LAPTOP, numValueOf9);
        sbrVar2.f(muz.V, numValueOf9);
        sbrVar2.f(muz.CAR, Integer.valueOf(R.string.number_of_object_car_plurals_other));
        sbrVar2.f(muz.BUS, Integer.valueOf(R.string.number_of_object_bus_plurals_other));
        sbrVar2.f(muz.TRUCK, Integer.valueOf(R.string.number_of_object_truck_plurals_other));
        muz muzVar10 = muz.BOOKS;
        Integer numValueOf10 = Integer.valueOf(R.string.number_of_object_document_plurals_other);
        sbrVar2.f(muzVar10, numValueOf10);
        sbrVar2.f(muz.BUSINESS_CARD, numValueOf10);
        sbrVar2.f(muz.GREETING_CARD, numValueOf10);
        sbrVar2.f(muz.MAGAZINE, numValueOf10);
        sbrVar2.f(muz.MEDIA_COVER, numValueOf10);
        sbrVar2.f(muz.PICTURE_FRAME, numValueOf10);
        sbrVar2.f(muz.POSTER, numValueOf10);
        sbrVar2.f(muz.POST_IT_NOTE, numValueOf10);
        sbrVar2.f(muz.ENVELOPE, numValueOf10);
        sbrVar2.f(muz.ai, numValueOf10);
        sbrVar2.f(muz.DOCUMENT, numValueOf10);
        C = sbrVar2.b();
    }

    public hjb(Context context, mwq mwqVar, owf owfVar, owf owfVar2, uem uemVar, owf owfVar3) {
        hjc hjcVar = hjc.UNKNOWN;
        this.u = hjcVar;
        this.J = hjcVar;
        this.K = 0;
        this.L = 0;
        this.M = "";
        this.N = 0L;
        muz muzVar = muz.UNKNOWN;
        this.v = muzVar;
        this.w = muzVar;
        this.O = false;
        this.P = muv.NONE;
        this.x = true;
        this.Q = false;
        this.a = context;
        this.y = mwqVar;
        owfVar.getClass();
        this.c = owfVar;
        this.d = owfVar2;
        this.e = uemVar;
        this.F = owfVar3;
        this.f = new hja(this);
        AudioAttributes.Builder contentType = new AudioAttributes.Builder().setUsage(11).setContentType(4);
        this.D = contentType.build();
        contentType.setUsage(1);
        this.E = contentType.build();
    }

    public static final int q(int i, int i2, int i3) {
        int i4;
        if (i2 != 0 && (i4 = (i * i3) / i2) >= 0) {
            return i4 >= i3 ? i3 - 1 : i4;
        }
        return 0;
    }

    private final float s() {
        int i;
        pnu pnuVar = this.o;
        if (pnuVar == null) {
            this.R = 1;
            return 0.0f;
        }
        Rect rect = pnuVar.c;
        float fMax = Math.max(rect.width(), rect.height());
        float fMax2 = Math.max(this.p.width(), this.p.height());
        if (!this.k) {
            if (fMax2 == 0.0f || fMax / fMax2 <= 0.05f) {
                return 0.05f;
            }
            return (q((int) fMax, (int) fMax2, 10) * 10) + 10;
        }
        pas pasVar = this.s;
        float fAbs = Math.abs((pasVar.a / pasVar.b) - 1.7777f);
        float f = fAbs <= 0.025f ? 26.0f : 35.0f;
        float f2 = fAbs <= 0.025f ? 14.0f : 18.0f;
        int i2 = (fMax2 == 0.0f || fMax / fMax2 <= 0.05f) ? 0 : (int) ((fMax * 100.0f) / fMax2);
        int i3 = this.R;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i3 != 1 ? 2 : 0;
        float f3 = i2;
        if (f3 < f) {
            if (f3 < f2) {
                i = f2 - f3 > ((float) i4) ? 4 : 3;
            }
            this.R = i;
        } else if (f3 - f >= i4) {
            this.R = 2;
            return f3;
        }
        return f3;
    }

    private final boolean t() {
        return this.q.equals(mwd.READY_TO_CAPTURE) || this.q.equals(mwd.FACE_TOO_FAR) || this.q.equals(mwd.FACE_TOO_CLOSE);
    }

    private static final int u(int i, boolean z2) {
        if (z2) {
            i = -i;
        }
        if (i < -75) {
            return 0;
        }
        return i > 75 ? 2 : 1;
    }

    public final String a(boolean z2) {
        float fS = s();
        if (fS == 0.05f) {
            return this.a.getString(R.string.face_size_tiny);
        }
        String strConcat = "";
        if (fS != 0.0f) {
            if (!this.k) {
                if (fS >= 50.0f) {
                    strConcat = ". ".concat(String.valueOf(this.a.getString(R.string.face_very_close)));
                } else if (fS >= 30.0f && z2) {
                    strConcat = ". ".concat(String.valueOf(this.a.getString(R.string.face_in_selfie_range)));
                }
                return String.valueOf(this.a.getString(R.string.face_size_percent_screen, Integer.valueOf((int) fS))).concat(strConcat);
            }
            if (t()) {
                pas pasVar = this.s;
                float fAbs = Math.abs((pasVar.a / pasVar.b) - 1.7777f);
                return String.format(Locale.US, "%s.", fS >= ((fAbs > 0.025f ? 1 : (fAbs == 0.025f ? 0 : -1)) <= 0 ? 26.0f : 35.0f) ? this.a.getString(R.string.face_too_close) : fS < ((fAbs > 0.025f ? 1 : (fAbs == 0.025f ? 0 : -1)) <= 0 ? 14.0f : 18.0f) ? this.a.getString(R.string.face_too_far) : this.a.getString(R.string.face_in_selfie_range));
            }
        }
        return "";
    }

    public final String b(muz muzVar, int i) {
        int iIntValue = ((Integer) Objects.requireNonNullElse(i == 1 ? (Integer) B.get(muzVar) : (Integer) C.get(muzVar), 0)).intValue();
        return iIntValue == 0 ? "" : this.a.getResources().getString(iIntValue, Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c(defpackage.mwk r8, boolean r9, int r10) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hjb.c(mwk, boolean, int):java.lang.String");
    }

    public final void d(String str, String str2) {
        int i;
        if (this.t.isEmpty()) {
            ((sgt) A.c().M(1318)).s("TextToSpeech is not ready to announce.");
            return;
        }
        if (this.M.equals(str) && (i = this.L) > 0) {
            this.L = i - 1;
            return;
        }
        if (this.M.equals(str)) {
            this.L = 3;
        } else {
            this.L = 1;
        }
        if (str2.equals(hjc.MULTIPLE_OBJECTS.u) && this.M.equals(str)) {
            int i2 = this.K + 1;
            this.K = i2;
            if (i2 >= 3) {
                if (i2 == 3) {
                    this.N = SystemClock.elapsedRealtime();
                }
                if (SystemClock.elapsedRealtime() - this.N < 15000) {
                    return;
                }
                this.K = 0;
                this.N = 0L;
            }
        } else {
            this.K = 0;
            this.N = 0L;
        }
        this.M = str;
        if (this.Q || !((Boolean) this.F.dL()).booleanValue()) {
            str = "";
        }
        Bundle bundle = new Bundle();
        bundle.putFloat("volume", 1.0f);
        ((TextToSpeech) this.t.get()).speak(str, 0, bundle, str2);
    }

    public final void e(String str, String str2, String str3) {
        if (!str3.isEmpty()) {
            str2 = String.valueOf(str2).concat(String.valueOf(String.format(Locale.ROOT, "[%s]", str3)));
        }
        d(str, str2);
    }

    public final void g() {
        this.j = false;
    }

    public final void h() {
        this.j = true;
    }

    public final void i(boolean z2) {
        this.F.dL();
        this.Q = z2;
        if (z2) {
            this.t.ifPresent(new gqw(3));
        }
    }

    public final void j(boolean z2) {
        this.x = z2;
        if (this.t.isEmpty()) {
            ((sgt) A.c().M(1326)).s("TextToSpeech is not ready to reset.");
        } else {
            ((TextToSpeech) this.t.get()).setAudioAttributes(z2 ? this.D : this.E);
        }
    }

    public final boolean k(hjc hjcVar) {
        return this.J.equals(hjcVar);
    }

    public final boolean l(hjc hjcVar) {
        return this.u.equals(hjcVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0031 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(int r10, int r11) {
        /*
            r9 = this;
            boolean r0 = r9.j
            r1 = 0
            if (r0 != 0) goto L6
            goto L3a
        L6:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r9.h
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r6 = 1
            if (r0 == 0) goto L1e
            long r4 = r2 - r4
            r7 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 <= 0) goto L1c
            goto L1e
        L1c:
            r0 = r1
            goto L1f
        L1e:
            r0 = r6
        L1f:
            if (r10 > 0) goto L2e
            int r10 = r9.i
            if (r10 != 0) goto L2d
            int r10 = r9.I
            if (r11 == r10) goto L2a
            goto L2d
        L2a:
            r10 = r1
            r4 = r10
            goto L2f
        L2d:
            r10 = r1
        L2e:
            r4 = r6
        L2f:
            if (r0 == 0) goto L3a
            if (r4 == 0) goto L3a
            r9.i = r10
            r9.I = r11
            r9.h = r2
            return r6
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hjb.m(int, int):boolean");
    }

    public final int n() {
        s();
        return this.R;
    }

    public final String o(mvc mvcVar) {
        boolean z2 = mvcVar.d;
        String string = "";
        String strConcat = (!z2 || this.O) ? "" : "".concat(String.valueOf(String.format(Locale.ROOT, "%s", this.a.getString(R.string.lighting_low))));
        this.O = z2;
        muv muvVar = mvcVar.e;
        if (!muvVar.equals(muv.NONE) && !muvVar.equals(this.P)) {
            Locale locale = Locale.ROOT;
            if (muvVar.j) {
                string = this.a.getString(R.string.device_angle_tilt_up);
            } else if (muvVar.k) {
                string = this.a.getString(R.string.device_angle_tilt_down);
            }
            strConcat = strConcat.concat(String.valueOf(String.format(locale, " %s", string)));
        }
        this.P = muvVar;
        return strConcat;
    }

    public final hjc r(String str) {
        this.J = hjc.a(str.replace(String.format(Locale.ROOT, "[%s]", this.v.name()), ""));
        hjc hjcVar = this.J;
        hjc hjcVar2 = hjc.UNKNOWN;
        if (!hjcVar.equals(hjcVar2)) {
            this.w = this.v;
        }
        this.u = hjcVar2;
        Iterator it = this.g.iterator();
        if (!it.hasNext()) {
            return this.J;
        }
        throw null;
    }

    public final void f(mwl[] mwlVarArr, Rect rect, int i, int i2, int i3, boolean z2) {
        String string;
        int iU;
        int iU2;
        int iCount = (int) DesugarArrays.stream(mwlVarArr).filter(new fla(20)).count();
        int length = mwlVarArr.length;
        if (length == 0) {
            this.y.h(this.a.getString(R.string.hotshot_no_face_announcement));
            return;
        }
        string = "";
        int i4 = 1;
        if (length != 1) {
            String str = OPuAVreQM.BYQAAusRD;
            if (length == i3) {
                Context context = this.a;
                String string2 = context.getString(R.string.max_face_announcement, Integer.valueOf(length));
                if (iCount > 0) {
                    string2 = String.format(Locale.ROOT, str, string2, context.getResources().getQuantityString(R.plurals.number_of_cropped_face, iCount, Integer.valueOf(iCount)));
                }
                this.y.h(string2);
                return;
            }
            if (iCount != 0) {
                mwq mwqVar = this.y;
                Locale locale = Locale.ROOT;
                Context context2 = this.a;
                mwqVar.h(String.format(locale, str, context2.getString(R.string.number_of_faces_announcement, Integer.valueOf(length)), context2.getResources().getQuantityString(R.plurals.number_of_cropped_face, iCount, Integer.valueOf(iCount))));
                return;
            }
            if (this.l) {
                mwq mwqVar2 = this.y;
                Context context3 = this.a;
                mwqVar2.h(String.valueOf(context3.getString(R.string.number_of_faces_announcement, Integer.valueOf(length))).concat(String.valueOf(this.q.equals(mwd.READY_TO_CAPTURE) ? context3.getString(R.string.face_in_selfie_range) : "")));
                return;
            } else {
                mwq mwqVar3 = this.y;
                Locale locale2 = Locale.US;
                Context context4 = this.a;
                mwqVar3.h(String.format(locale2, "%s %s.", context4.getString(R.string.number_of_faces_announcement, Integer.valueOf(length)), context4.getString(R.string.face_in_selfie_range)));
                return;
            }
        }
        mwq mwqVar4 = this.y;
        Context context5 = this.a;
        int i5 = iCount == 1 ? R.string.hotshot_detailed_cropped_face_announcement : R.string.hotshot_detailed_face_announcement;
        pnu pnuVar = mwlVarArr[0].a;
        if (!t()) {
            Rect rect2 = pnuVar.c;
            int iCenterX = rect2.centerX();
            int iCenterY = rect2.centerY();
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i6 = (i2 + i) % 360;
            if (z2) {
                int i7 = i % 180;
                if (i7 == 0) {
                    iCenterX = iWidth - iCenterX;
                } else if (i7 != 0) {
                    iCenterY = iHeight - iCenterY;
                }
            }
            int iCenterX2 = iCenterX - rect.centerX();
            int iCenterY2 = iCenterY - rect.centerY();
            if (i6 == 0) {
                iU = u(iCenterY2, false);
                iU2 = u(iCenterX2, false);
            } else if (i6 == 90) {
                iU = u(iCenterX2, false);
                iU2 = u(iCenterY2, true);
            } else if (i6 == 180) {
                iU = u(iCenterY2, true);
                iU2 = u(iCenterX2, true);
            } else {
                if (i6 != 270) {
                    throw new IllegalStateException(a.bu(i, i2, "Invalid sensor rotation. Display orientation: ", ", Sensor orientation: "));
                }
                iU = u(iCenterX2, true);
                iU2 = u(iCenterY2, false);
            }
            int[][] iArr = this.G;
            if (iU2 >= iArr[iU].length) {
                ((sgt) A.c().M(1324)).w(mNLbzhCxd.enS, iU, iU2);
            } else {
                if (iU != 1) {
                    i4 = iU;
                } else if (iU2 != 1) {
                }
                string = this.q.equals(mwd.DISTANCE_1) ? context5.getString(R.string.move_phone_slightly_with_direction, context5.getString(iArr[i4][iU2])) : context5.getString(R.string.move_phone_with_direction, context5.getString(iArr[i4][iU2]));
            }
        }
        mwqVar4.h(String.valueOf(context5.getString(i5, string)).concat(String.valueOf(a(z2))));
    }

    public final String p(sbp sbpVar) throws Resources.NotFoundException {
        sbp sbpVar2;
        String string = "";
        if (sbpVar.isEmpty()) {
            return "";
        }
        int i = 13;
        sbp sbpVarT = sbp.t(Comparator$CC.comparing(new gbm(8), new ccn(13)), sbpVar);
        int i2 = 0;
        String strB = "";
        String strConcat = strB;
        String strConcat2 = strConcat;
        String strB2 = strConcat2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            mux muxVar = ((mwk) sbpVarT.get(i2)).a;
            Stream stream = Collection.EL.stream(sbpVarT);
            muz muzVar = muxVar.a;
            int iCount = (int) stream.filter(new fme(muzVar, 12)).count();
            if (iCount != 0) {
                i3++;
            }
            int iCount2 = (int) Collection.EL.stream(sbpVarT).filter(new fme(muzVar, i)).count();
            if (iCount2 != 0) {
                i4++;
            }
            boolean zIsEmpty = strB.isEmpty();
            String str = JvFFEwFNdCrxf.ntoqPsbxpGaiogp;
            if (zIsEmpty) {
                sbpVar2 = sbpVarT;
            } else {
                sbpVar2 = sbpVarT;
                strConcat = strConcat.concat(String.valueOf(String.format(Locale.ROOT, str, true != strConcat.isEmpty() ? ", " : "", strB)));
            }
            strB = b(muzVar, iCount);
            if (iCount2 != 0) {
                if (!strB2.isEmpty()) {
                    strConcat2 = strConcat2.concat(String.valueOf(String.format(Locale.ROOT, str, true != strConcat2.isEmpty() ? ", " : "", strB2)));
                }
                strB2 = b(muzVar, iCount2);
            }
            i2 += iCount;
            if (i2 >= ((sex) sbpVar2).c || i3 > 4) {
                break;
            }
            sbpVarT = sbpVar2;
            i = 13;
        }
        if (i3 > 4) {
            return this.a.getResources().getString(R.string.more_than_max_object_types_announcement, strConcat);
        }
        Context context = this.a;
        String string2 = context.getResources().getString(i3 == 1 ? this.x ? R.string.objects_summary_plurals_one : R.string.objects_summary_plurals_one_non_talkback : R.string.objects_summary_in_back_plurals_other, strConcat, strB);
        if (i4 != 0) {
            string = context.getResources().getString(i4 == 1 ? R.string.objects_summary_cropped_plurals_one : R.string.objects_summary_cropped_in_back_plurals_other, strConcat2, strB2);
        }
        return String.format(Locale.ROOT, "%s %s", string2, string);
    }
}
