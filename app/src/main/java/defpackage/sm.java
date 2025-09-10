package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sm implements ri {
    private final String a;
    private final CameraCharacteristics b;
    private final Set c;
    private final ArrayMap d = new ArrayMap();
    private final ues e;
    private final ues f;
    private final ues g;
    private final ues h;
    private final ut i;

    public sm(String str, CameraCharacteristics cameraCharacteristics, ut utVar, Set set) {
        this.a = str;
        this.b = cameraCharacteristics;
        this.i = utVar;
        this.c = set;
        new ArrayMap();
        this.e = rnt.aO(2, new ne(this, 5));
        rnt.aO(2, new ne(this, 6));
        this.f = rnt.aO(2, new ne(this, 7));
        rnt.aO(2, new ne(this, 8));
        this.g = rnt.aO(2, new ne(this, 9));
        rnt.aO(2, new ne(this, 10));
        this.h = rnt.aO(2, new ne(this, 11));
    }

    public static final Set b(sm smVar) {
        try {
            try {
                Trace.beginSection(((Object) pp.a(smVar.a)) + "#keys");
                List<CameraCharacteristics.Key<?>> keys = smVar.b.getKeys();
                if (keys == null) {
                    keys = ufw.a;
                }
                return ske.bQ(keys);
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e) {
            Log.w("CXCP", "Failed to getKeys from " + ((Object) pp.a(smVar.a)) + '}', e);
            return ufy.a;
        }
    }

    public static final Set d(sm smVar) {
        try {
            StringBuilder sb = new StringBuilder();
            String str = smVar.a;
            sb.append((Object) pp.a(str));
            sb.append("#physicalCameraIds");
            try {
                Trace.beginSection(sb.toString());
                Set<String> physicalCameraIds = smVar.b.getPhysicalCameraIds();
                physicalCameraIds.getClass();
                Objects.toString(pp.a(str));
                Objects.toString(physicalCameraIds);
                ArrayList arrayList = new ArrayList(ske.bq(physicalCameraIds, 10));
                for (String str2 : physicalCameraIds) {
                    pp.b(str2);
                    arrayList.add(new pp(str2));
                }
                return ske.bQ(arrayList);
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e) {
            String strA = pp.a(smVar.a);
            Objects.toString(strA);
            Log.w("CXCP", "Failed to getPhysicalCameraIds from ".concat(strA), e);
            return ufy.a;
        } catch (NullPointerException e2) {
            String strA2 = pp.a(smVar.a);
            Objects.toString(strA2);
            Log.w("CXCP", "Failed to getPhysicalCameraIds from ".concat(strA2), e2);
            return ufy.a;
        }
    }

    public static final Set e(sm smVar) {
        try {
            try {
                Trace.beginSection("Camera-" + smVar.a + "#availablePhysicalCameraRequestKeys");
                List<CaptureRequest.Key<?>> availablePhysicalCameraRequestKeys = smVar.b.getAvailablePhysicalCameraRequestKeys();
                if (availablePhysicalCameraRequestKeys == null) {
                    availablePhysicalCameraRequestKeys = ufw.a;
                }
                return ske.bQ(availablePhysicalCameraRequestKeys);
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e) {
            Log.w("CXCP", "Failed to getAvailablePhysicalCameraRequestKeys from Camera-".concat(smVar.a), e);
            return ufy.a;
        }
    }

    public static final Set f(sm smVar) {
        try {
            try {
                Trace.beginSection(((Object) pp.a(smVar.a)) + "#availableCaptureRequestKeys");
                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = smVar.b.getAvailableCaptureRequestKeys();
                if (availableCaptureRequestKeys == null) {
                    availableCaptureRequestKeys = ufw.a;
                }
                return ske.bQ(availableCaptureRequestKeys);
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e) {
            String strA = pp.a(smVar.a);
            Objects.toString(strA);
            Log.w("CXCP", "Failed to getAvailableCaptureRequestKeys from ".concat(strA), e);
            return ufy.a;
        }
    }

    public static final Set g(sm smVar) {
        try {
            try {
                Trace.beginSection(((Object) pp.a(smVar.a)) + "#availableCaptureResultKeys");
                List<CaptureResult.Key<?>> availableCaptureResultKeys = smVar.b.getAvailableCaptureResultKeys();
                if (availableCaptureResultKeys == null) {
                    availableCaptureResultKeys = ufw.a;
                }
                return ske.bQ(availableCaptureResultKeys);
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e) {
            String strA = pp.a(smVar.a);
            Objects.toString(strA);
            Log.w("CXCP", "Failed to getAvailableCaptureResultKeys from ".concat(strA), e);
            return ufy.a;
        }
    }

    public static final Set h(sm smVar) {
        try {
            try {
                Trace.beginSection("Camera-" + smVar.a + "#availableSessionKeys");
                List<CaptureRequest.Key<?>> availableSessionKeys = smVar.b.getAvailableSessionKeys();
                if (availableSessionKeys == null) {
                    availableSessionKeys = ufw.a;
                }
                return ske.bQ(availableSessionKeys);
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e) {
            Log.w("CXCP", "Failed to getAvailableSessionKeys from Camera-".concat(smVar.a), e);
            return ufy.a;
        }
    }

    public static final Set i(sm smVar) {
        CameraExtensionCharacteristics cameraExtensionCharacteristics;
        try {
            StringBuilder sb = new StringBuilder("Camera-");
            String str = smVar.a;
            sb.append((Object) pp.a(str));
            sb.append("#supportedExtensions");
            try {
                Trace.beginSection(sb.toString());
                ut utVar = smVar.i;
                Object obj = utVar.f;
                synchronized (obj) {
                    cameraExtensionCharacteristics = (CameraExtensionCharacteristics) ((ArrayMap) obj).get(str);
                    if (cameraExtensionCharacteristics == null) {
                        Objects.toString(pp.a(str));
                        Object systemService = ((Context) utVar.c).getSystemService("camera");
                        systemService.getClass();
                        cameraExtensionCharacteristics = ((CameraManager) systemService).getCameraExtensionCharacteristics(str);
                        cameraExtensionCharacteristics.getClass();
                    }
                }
                List<Integer> supportedExtensions = cameraExtensionCharacteristics.getSupportedExtensions();
                supportedExtensions.getClass();
                return ske.bQ(supportedExtensions);
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e) {
            String strA = pp.a(smVar.a);
            Objects.toString(strA);
            Log.w("CXCP", "Failed to getSupportedExtensions from Camera-".concat(strA), e);
            return ufy.a;
        }
    }

    private static final Object n(CameraCharacteristics cameraCharacteristics, CameraCharacteristics.Key key) {
        try {
            return cameraCharacteristics.get(key);
        } catch (AssertionError unused) {
            throw new IllegalStateException(a.bz(key, "Failed to get characteristic for ", ": Framework throw an AssertionError"));
        }
    }

    public final Object a(CameraCharacteristics.Key key) {
        Object obj;
        if (this.c.contains(key)) {
            return n(this.b, key);
        }
        ArrayMap arrayMap = this.d;
        synchronized (arrayMap) {
            obj = arrayMap.get(key);
        }
        if (obj != null) {
            return obj;
        }
        Object objN = n(this.b, key);
        if (objN == null) {
            return objN;
        }
        ArrayMap arrayMap2 = this.d;
        synchronized (arrayMap2) {
            arrayMap2.put(key, objN);
        }
        return objN;
    }

    @Override // defpackage.ri
    public final Object c(ukx ukxVar) {
        throw null;
    }

    public final Set j() {
        return (Set) this.g.a();
    }

    public final Set k() {
        return (Set) this.f.a();
    }

    public final Set l() {
        return (Set) this.h.a();
    }

    public final Set m() {
        return (Set) this.e.a();
    }
}
