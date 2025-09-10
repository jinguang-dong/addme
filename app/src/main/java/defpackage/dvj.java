package defpackage;

import androidx.window.sidecar.SidecarDisplayFeature;
import com.google.googlex.gcam.ShotMetadata;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dvj implements uiq {
    private final /* synthetic */ int a;

    public /* synthetic */ dvj(int i) {
        this.a = i;
    }

    @Override // defpackage.uiq
    public final Object a(Object obj) {
        ddw ddwVarA;
        String str = null;
        switch (this.a) {
            case 0:
                SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) obj;
                int i = dvk.a;
                sidecarDisplayFeature.getClass();
                boolean z = true;
                if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) obj;
                int i2 = dvk.a;
                sidecarDisplayFeature2.getClass();
                return Boolean.valueOf((sidecarDisplayFeature2.getRect().width() == 0 && sidecarDisplayFeature2.getRect().height() == 0) ? false : true);
            case 2:
                SidecarDisplayFeature sidecarDisplayFeature3 = (SidecarDisplayFeature) obj;
                int i3 = dvk.a;
                sidecarDisplayFeature3.getClass();
                return Boolean.valueOf(sidecarDisplayFeature3.getRect().left == 0 || sidecarDisplayFeature3.getRect().top == 0);
            case 3:
                try {
                    ((ddo) obj).a("UPDATE EnumerationErrorCounts SET rebootCount = rebootCount+1").j();
                    return null;
                } finally {
                }
            case 4:
                try {
                    ((ddo) obj).a("UPDATE FatalErrorCounts SET rebootCount = rebootCount+1").j();
                    return null;
                } finally {
                }
            case 5:
                return a.ab((cbn) obj);
            case 6:
                blm blmVar = (blm) obj;
                blmVar.getClass();
                blmVar.q(1);
                return ufg.a;
            case 7:
                ((cbn) obj).getClass();
                return ufg.a;
            case 8:
                String str2 = (String) obj;
                str2.getClass();
                return Float.valueOf(Float.parseFloat(str2));
            case 9:
                ddwVarA = ((ddo) obj).a("SELECT * FROM shots ORDER BY shot_id");
                try {
                    int iW = cgh.w(ddwVarA, "shot_id");
                    int iW2 = cgh.w(ddwVarA, "title");
                    int iW3 = cgh.w(ddwVarA, "start_millis");
                    int iW4 = cgh.w(ddwVarA, "persisted_millis");
                    int iW5 = cgh.w(ddwVarA, "canceled_millis");
                    int iW6 = cgh.w(ddwVarA, "deleted_millis");
                    int iW7 = cgh.w(ddwVarA, "most_recent_event_millis");
                    int iW8 = cgh.w(ddwVarA, "capture_session_type");
                    int iW9 = cgh.w(ddwVarA, "capture_session_shot_id");
                    int iW10 = cgh.w(ddwVarA, "pid");
                    int iW11 = cgh.w(ddwVarA, "stuck");
                    int iW12 = cgh.w(ddwVarA, "failed");
                    ArrayList arrayList = new ArrayList();
                    while (ddwVarA.j()) {
                        hez hezVar = new hez();
                        int i4 = iW11;
                        int i5 = iW12;
                        hezVar.a = ddwVarA.b(iW);
                        if (ddwVarA.i(iW2)) {
                            hezVar.b = str;
                        } else {
                            hezVar.b = ddwVarA.d(iW2);
                        }
                        hezVar.c = ddwVarA.b(iW3);
                        hezVar.d = ddwVarA.b(iW4);
                        hezVar.e = ddwVarA.b(iW5);
                        hezVar.f = ddwVarA.b(iW6);
                        hezVar.g = ddwVarA.b(iW7);
                        if (ddwVarA.i(iW8)) {
                            hezVar.h = str;
                        } else {
                            hezVar.h = ddwVarA.d(iW8);
                        }
                        if (ddwVarA.i(iW9)) {
                            hezVar.i = str;
                        } else {
                            hezVar.i = ddwVarA.d(iW9);
                        }
                        hezVar.j = ddwVarA.b(iW10);
                        iW11 = i4;
                        String str3 = str;
                        hezVar.k = ((int) ddwVarA.b(iW11)) != 0;
                        int i6 = iW;
                        int i7 = iW2;
                        hezVar.l = ((int) ddwVarA.b(i5)) != 0;
                        arrayList.add(hezVar);
                        iW12 = i5;
                        str = str3;
                        iW = i6;
                        iW2 = i7;
                    }
                    return arrayList;
                } finally {
                }
            case 10:
                ddwVarA = ((ddo) obj).a("SELECT shot_id, capture_session_type FROM shots WHERE NOT failed AND  persisted_millis = 0 AND canceled_millis = 0 AND deleted_millis = 0");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (ddwVarA.j()) {
                        hey heyVar = new hey();
                        heyVar.a = ddwVarA.b(0);
                        if (ddwVarA.i(1)) {
                            heyVar.b = null;
                        } else {
                            heyVar.b = ddwVarA.d(1);
                        }
                        arrayList2.add(heyVar);
                    }
                    return arrayList2;
                } finally {
                }
            case 11:
                ddwVarA = ((ddo) obj).a("SELECT * FROM shot_log ORDER BY shot_id DESC, sequence");
                try {
                    int iW13 = cgh.w(ddwVarA, "sequence");
                    int iW14 = cgh.w(ddwVarA, "shot_id");
                    int iW15 = cgh.w(ddwVarA, "time_millis");
                    int iW16 = cgh.w(ddwVarA, "message");
                    ArrayList arrayList3 = new ArrayList();
                    while (ddwVarA.j()) {
                        hfd hfdVar = new hfd();
                        hfdVar.a = (int) ddwVarA.b(iW13);
                        hfdVar.b = ddwVarA.b(iW14);
                        hfdVar.c = ddwVarA.b(iW15);
                        if (ddwVarA.i(iW16)) {
                            hfdVar.d = null;
                        } else {
                            hfdVar.d = ddwVarA.d(iW16);
                        }
                        arrayList3.add(hfdVar);
                    }
                    return arrayList3;
                } finally {
                }
            case 12:
                htk htkVar = (htk) obj;
                htkVar.getClass();
                return ske.aV(htkVar);
            case 13:
                ((ShotMetadata) obj).getClass();
                return ufg.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                cbn cbnVar = (cbn) obj;
                cbnVar.getClass();
                cbw.b(cbnVar);
                return ufg.a;
            case 15:
                ((String) obj).getClass();
                return ufg.a;
            case 16:
                Float f = (Float) obj;
                f.floatValue();
                return new DecimalFormat("#.##").format(f);
            case 17:
                ((cbn) obj).getClass();
                return ufg.a;
            case 18:
                return a.ab((cbn) obj);
            case 19:
                ((cbn) obj).getClass();
                return ufg.a;
            default:
                return a.ab((cbn) obj);
        }
    }
}
